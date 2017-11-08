package com.fa.backlotv4.utils;

import com.fa.backlotv4.GuiController;
import com.fa.backlotv4.enums.BrowserType;

/**
 * Created by onkar.mhantati on 9/18/2017.
 */
public class BrowserDriver {

    public static void startBrowser(){
        startBrowser(BrowserType.CHROME);
    }
    public static void startBrowser(BrowserType browser){
        GuiController.setWebDriver(browser);
    }

    public static void accessUrl(String url){
        GuiController.getWebDriver().get(url);
    }

    public static void stopBrowser(){
        GuiController.getWebDriver().quit();
    }

    public static void closeBrowser(){
        GuiController.getWebDriver().close();
    }
}
