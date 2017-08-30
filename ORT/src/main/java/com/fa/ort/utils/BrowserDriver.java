package com.fa.ort.utils;

import com.fa.ort.GuiControl;
import com.fa.ort.enums.BrowserType;

/**
 * Created by Onkar on 7/11/2017.
 */
public class BrowserDriver {

    public static void startBrowser(){startBrowser(BrowserType.GOOGLECHROME);}

    public static void startBrowser(String browser){GuiControl.setWebDriver(browser);}

    public static void startBrowser(BrowserType browser){GuiControl.setWebDriver(browser);}

    public static void accessURL(String url){GuiControl.getWebDriver().get(url);}

    public static void stopBrowser(){
        if(!GuiControl.browserName.equalsIgnoreCase("firefox")){
            GuiControl.getWebDriver().quit();
        }
    }

    public static void closeBrowser(){GuiControl.getWebDriver().close();}

}
