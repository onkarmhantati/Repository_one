package com.fa.ort;


import com.fa.ort.enums.SeleniumByMethod;
import com.fa.ort.enums.BrowserType;

import com.google.common.base.Function;
import com.typesafe.config.Config;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Onkar on 7/11/2017.
 */
public class GuiControl {

    public static Logger logger = Logger.getLogger(GuiControl.class);

    protected static WebDriver webDriver;
    private WebElement webElement;
    private List<WebElement> webElementList;
    public static String browserName;
    protected String elementIdentifier;
    protected SeleniumByMethod seleniumMethod;
    protected String controlName;
    private Config controlconfig;



    public GuiControl(){

    }

    public GuiControl(Config config){
        this.controlconfig=config;
        this.controlName=controlconfig.getString("controlName");
        this.elementIdentifier=controlconfig.getString("locatorValue");
        this.seleniumMethod=SeleniumByMethod.valueOf(controlconfig.getString("locatorType"));

    }

    private GuiControl(String string,SeleniumByMethod idetificationMethod){
        this.elementIdentifier=string;
        this.seleniumMethod=idetificationMethod;
    }

    public void updateIdentifier(String replacment){
        this.elementIdentifier=this.elementIdentifier.replaceFirst("TBD",replacment);
    }

    public SeleniumByMethod getSeleniumMethod(){return this.seleniumMethod;}

    public String getElementIdentifier(){ return this.elementIdentifier;}

    public  static WebDriver getWebDriver(){return webDriver;}

    public WebElement getGuiControl(SeleniumByMethod selectionMethod,String identifer){
        WebElement webElement=null;
        switch (selectionMethod){
            case CLASSNAME:
                webElement=webDriver.findElement(By.className(identifer));
                break;

            case XPATH:
                webElement= webDriver.findElement(By.xpath(identifer));
                break;

            case CSSSELECTOR:
                webElement= webDriver.findElement(By.cssSelector(identifer));
                break;

            case ID:
                webElement=webDriver.findElement(By.id(identifer));
                break;

            case LINKTEXT:
                webElement=webDriver.findElement(By.linkText(identifer));
                break;

            case NAME:
                webElement=webDriver.findElement(By.name(identifer));
                break;

            case PARTIALLINKTEXT:
                webElement=webDriver.findElement(By.partialLinkText(identifer));
                break;

            case TAGNAME:
                webElement=webDriver.findElement(By.tagName(identifer));
                break;

            default:
                logger.error("Invalid LocatorType :"+ selectionMethod.name());
                break;
        }
        return webElement;
    }

    public List<WebElement> getGuiControlChildren(SeleniumByMethod selectionMethod,String identifier){
    List<WebElement> webElementsList= null;
    switch (selectionMethod){

        case CLASSNAME:
            webElementList = getGuiControl().findElements(By.className(identifier));
            break;

        case XPATH:
            webElementList = getGuiControl().findElements(By.xpath(identifier));
            break;
        case CSSSELECTOR:
            webElementList = getGuiControl().findElements(By.cssSelector(identifier));
            break;
        case ID:
            webElementList = getGuiControl().findElements(By.id(identifier));
            break;
        case LINKTEXT:
            webElementList = getGuiControl().findElements(By.linkText(identifier));
            break;
        case NAME:
            webElementList = getGuiControl().findElements(By.name(identifier));
            break;
        case PARTIALLINKTEXT:
            webElementList = getGuiControl().findElements(By.partialLinkText(identifier));
            break;
        case TAGNAME:
            webElementList = getGuiControl().findElements(By.tagName(identifier));
            break;
        default:
            logger.error("Invalid locatorType : " + selectionMethod.name());
            break;
    }
        return webElementList;
    }

    public  WebElement getGuiControl(){
        if (!(this.webElement==null)) {
            return webElement;
        }
            return getGuiControl(seleniumMethod,elementIdentifier);
        }

    public List<WebElement> getGuiControlChildren() {
        if (!(this.webElementList == null)) {
            return webElementList;
        }
        return getGuiControlChildren(seleniumMethod, elementIdentifier);
    }

    public WebElement getParentElement(){
        WebElement we=getGuiControl(getSeleniumMethod(),getElementIdentifier());
        return we.findElement(By.xpath(".."));
    }

    public void setText(String string){
    getGuiControl(getSeleniumMethod(),getElementIdentifier()).clear();
    sendKeys(string);
    }

    public void sendKeys(String str){
        getGuiControl().sendKeys(str);
    }

    public void clear(){getGuiControl().clear();}

    public String getText(){return  getGuiControl().getText();}

    public void clickJScript(){
        JavascriptExecutor executor=(JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click();", getGuiControl());
    }

    public static void waitForSec(long time){
        try{
            Thread.sleep(time*1000);
        }catch (InterruptedException e){
            logger.trace(e.getMessage());
        }
    }

    public void click(){
        WebElement element =getGuiControl();
        if(!element.isDisplayed()){
            ((JavascriptExecutor)getWebDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
                waitForSec(1);
        }
        if(!element.isDisplayed()){
            Point location= element.getLocation();
            String s =String.format("javascript:window.scrollBy(%d,%d)",location.getX(),location.getY());
            JavascriptExecutor js=(JavascriptExecutor) getWebDriver();
            js.executeScript(s);
        }
        try{
            getGuiControl().click();
        }catch (StaleElementReferenceException e){
            logger.error("Encountered StaleElementException, consider using click_Retry method insted");
        }
    }

    public void clickOnElementOfList(String text){
        List<WebElement> webElementList= getGuiControlChildren();
        for(WebElement element:webElementList){
           try {
               if(element.getText().equals(text)){
                   if(!element.isDisplayed()){
                    Point location=element.getLocation();
                    String s=String.format("javascript:window.scrollBy(%d,%d)",location.getX(),location.getY());
                    JavascriptExecutor js=(JavascriptExecutor) getWebDriver();
                    js.executeScript(s);
                   }

                   getGuiControl().click();
                   break;
               }
           }catch (StaleElementReferenceException e){
                logger.error("Encountered StaleElementException, consider using click_Retry method insted");
           }
        }

    }

    public boolean isVisible(){return this.getGuiControl().isDisplayed();}

    public boolean isEnable(){return  this.getGuiControl().isEnabled();}

    public boolean isExist(){

        GuiControl pageRoot =new GuiControl("//html[1]",SeleniumByMethod.XPATH);
        List<WebElement> thisElement = pageRoot.getGuiControlChildren(this.seleniumMethod,this.elementIdentifier);
        if(thisElement.size()==0){
            return false;
        }
        else {
            return true;
        }
    }

    public Point getControlLocation(){return getGuiControl().getLocation();}

    public String getAttribute(String attributeName){
        String attributeVal=getGuiControl().getAttribute(attributeName);
        return attributeVal;
    }

    public void selectByVisibleText(String selection){
        new Select(getGuiControl()).selectByVisibleText(selection);
    }

    public void selectByIndex(Integer index){
        new Select(getGuiControl()).selectByIndex(index);
    }

    public void selectByValue(String value){
        new Select(getGuiControl()).selectByValue(value);
    }

    public static void setWebDriver(String browser){

        browserName=browser;
        DesiredCapabilities desiredCapabilities=null;

        switch (browser){
            case "FIREFOX":
                desiredCapabilities = DesiredCapabilities.firefox();
                break;
            case "CHROME":
                desiredCapabilities= DesiredCapabilities.chrome();
                ChromeOptions options=new ChromeOptions();
                Map<String,Object> prefs = new HashMap<>();
                prefs.put("credentials_enable_service",false);
                prefs.put("profile.password_manager_enabled",false);
                options.setExperimentalOption("prefs",prefs);
                desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,options);
                break;

            default:
                logger.error("Invalid browser name/value : "+ browser);
                break;
        }
        setWebDriver(browser,desiredCapabilities);

    }

    public static void setWebDriver(BrowserType browser){

        DesiredCapabilities desiredCapabilities=null;
        switch (browser){
            case FIREFOX:
                desiredCapabilities=DesiredCapabilities.firefox();
                break;
            case GOOGLECHROME:
                desiredCapabilities=DesiredCapabilities.chrome();
                break;
            case SAFARI:
                desiredCapabilities=DesiredCapabilities.safari();
                break;
            default:
                logger.error("Invalid browser name/value : " + browser.name());
                break;
        }
        setWebDriver(browser.name(),desiredCapabilities);
        //webDriver.manage().window().maximize();
    }

    public static void setWebDriver(String browser,DesiredCapabilities desiredCapabilities){
        switch (browser){
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver",getDriverPath(browser.toLowerCase()));
                webDriver= new FirefoxDriver(desiredCapabilities);
                break;

            case "CHROME":
                System.setProperty("webdriver.chrome.driver",getDriverPath(browser.toLowerCase()));
                webDriver=new ChromeDriver(desiredCapabilities);
                break;

            case "SAFARI":
                webDriver=new SafariDriver(desiredCapabilities);
                break;

            default:
                logger.error("Invalid browser name/value : " + browser);
                break;
        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    private static String   getDriverPath(String browserName){
        String osName=System.getProperty("os.name").toLowerCase();
        String driverPath=null;
        if(osName.contains("win")){
            driverPath=System.getProperty("user.dir")+ "/src/test/resources/driver/windows/" + browserName + "driver.exe";
        }
        if(osName.contains("mac")){
            driverPath=System.getProperty("user.dir")+ "/src/test/resources/driver/mac/" + browserName+"driver";
        }
        return driverPath;
    }

    //Not understand
    public static void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(getWebDriver(), 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : " +String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")).equals("complete");
            }
        });
    }

    public static Set<String> getAllWindowHandles() {
        return getWebDriver().getWindowHandles();
    }

    public static String getCurrentWindowHandle() {
        return getWebDriver().getWindowHandle();
    }

    public static void switchToNewWindow(String window){getWebDriver().switchTo().window(window);}

    public void mouseHover(){
        Actions bulider =new Actions(webDriver);
        bulider.moveToElement(getGuiControl()).build().perform();
    }

    public void scrollIntoViewPort(){
        ((JavascriptExecutor)getWebDriver()).executeScript("arguments[0].scrollIntoView(true);",getGuiControl());
    }

    public boolean waitForElement(int timeInSecond){
        boolean result=false;
        for(int i=0;i<timeInSecond;i++){
            if(isExist()){
                return true;
            }
            waitForSec(1);
        }
        return  result;
    }


    public boolean waitForElementToVisible(int timeInSecond){
        boolean result=false;
        waitForElement(timeInSecond);
        for(int i=0;i<timeInSecond/2;i++){
            if(waitForElement(1)){
                if(getGuiControl().isDisplayed()){
                    return true;
                }
                else {
                    waitForSec(1);
                }
            }
        }
        return result;
    }



}
