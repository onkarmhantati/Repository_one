package Test;

//import SeleniumByMethod;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by onkar.mhantati on 9/11/2017.
 */
public class GuiControl {
    public static Logger logger=Logger.getLogger(GuiControl.class);

    protected static WebDriver webDriver;
    private WebElement webElement;
    private List<WebElement> webElementList;
    protected String locatorType;
    protected String locatorValue;
    protected String browserName;

    public GuiControl(String locator){
        locatorType=locator.split("_TBD_")[0];
        locatorValue=locator.split("_TBD_")[1];
    }

    public WebElement getWebElement(){
        if (!(this.webElement==null)) {
            return webElement;
        }
        return getWebElement(locatorType,locatorValue);
    }
    public WebElement getWebElement(String locatorType,String locatorValue){
        switch (locatorType.toUpperCase()){
            case "ID":
                webElement=webDriver.findElement(By.id(locatorValue));
                break;

            case "CLASSNAME":
                webElement=webDriver.findElement(By.className(locatorValue));
                break;

            case "LINKTEXT":
                webElement=webDriver.findElement(By.linkText(locatorValue));
                break;

            case "NAME":
                webElement=webDriver.findElement(By.name(locatorValue));
                break;

            case "PARTIALLINKTEXT":
                webElement=webDriver.findElement(By.partialLinkText(locatorValue));
                break;

            case "TAFNAME":
                webElement=webDriver.findElement(By.tagName(locatorValue));
                break;

            case "CSSSELECTOR":
                webElement=webDriver.findElement(By.cssSelector(locatorValue));
                break;

            case "XPATH":
                webElement=webDriver.findElement(By.xpath(locatorValue));
                break;

            default:
                System.out.println("Invalid LocatorType :"+locatorType.toUpperCase());
                break;
        }
        return webElement;
    }

    public List<WebElement> getWebElementList(String locatorType,String locatorValue){
        List<WebElement> webElementList=null;
        switch (locatorType.toUpperCase()){
            case "ID":
                webElementList=getWebElement().findElements(By.id(locatorValue));
                break;

            case "CLASSNAME":
                webElementList=getWebElement().findElements(By.className(locatorValue));
                break;

            case "LINKTEXT":
                webElementList=getWebElement().findElements(By.linkText(locatorValue));
                break;

            case "NAME":
                webElementList=getWebElement().findElements(By.name(locatorValue));
                break;

            case "PARTIALLINKTEXT":
                webElementList=getWebElement().findElements(By.partialLinkText(locatorValue));
                break;

            case "TAFNAME":
                webElementList=getWebElement().findElements(By.tagName(locatorValue));
                break;

            case "CSSSELECTOR":
                webElementList=getWebElement().findElements(By.cssSelector(locatorValue));
                break;

            case "XPATH":
                webElementList=getWebElement().findElements(By.xpath(locatorValue));
                break;

            default:
                System.out.println("Invalid LocatorType :"+locatorType.toUpperCase());
                break;
        }
        return webElementList;
    }

    public static void setWebDriver(String browserName){
        switch (browserName.toUpperCase()){
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver",getDriverPath(browserName.toLowerCase()));
                webDriver =new FirefoxDriver();
                break;

            case "CHROME":
                System.setProperty("webdriver.chrome.driver",getDriverPath(browserName.toLowerCase()));
                webDriver=new ChromeDriver();
                break;

            default:
                System.out.println("Invalid browser name."+browserName.toLowerCase());
                break;
        }

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    private static String getDriverPath(String browserName){
        String osName=System.getProperty("os.name").toLowerCase();
        String driverPath=null;
        if(osName.contains("win")){
            driverPath=System.getProperty("user.dir")+"/src/main/resources/drivers/win/"+browserName+"driver.exe";
        }
        if(osName.contains("mac")){

        }
        return driverPath;
    }

    public WebElement getParentElement(){
        WebElement we=getWebElement(this.locatorType,this.locatorValue);
        return we.findElement(By.xpath(".."));
    }

    public void setText(String text){
        getWebElement(locatorType,locatorValue).clear();
        sendKeys(text);
    }

    public void sendKeys(String text){
        getWebElement().sendKeys(text);
    }

    public String getText(){
        return getWebElement().getText();
    }

    public void click(){
        getWebElement().click();
    }

}
