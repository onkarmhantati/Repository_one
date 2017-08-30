package com.fa.ort.pageControllers;

import com.fa.ort.GuiControl;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * Created by Onkar on 7/12/2017.
 */
public class PageControl extends GuiControl{

    //public static GuiControl loader =new GuiControl(getElementConfig("loader"));

        public final static Config getElementConfig(String skey){
            StackTraceElement[] elements=Thread.currentThread().getStackTrace();

            String classFullName = elements[2].getClassName();
            String objectRepoFile =classFullName.substring(classFullName.lastIndexOf(".")+1);

            Config configAt=PageObjectRepository.getObjectRepo(objectRepoFile).getConfig(objectRepoFile+"."+skey);
            Config myConf = configAt.withFallback(ConfigFactory.parseString("controlName= "+skey));

            return myConf;
        }

    public static String getTitle(){
        return getWebDriver().getTitle();
    }

    public static void refresh(){getWebDriver().navigate().refresh();}

    public static void scrollTop(){
        WebElement element=getWebDriver().findElement(By.tagName("html"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) getWebDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);
    }




}
