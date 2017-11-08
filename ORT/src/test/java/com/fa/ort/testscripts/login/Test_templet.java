package com.fa.ort.testscripts.login;

import com.fa.ort.utils.BrowserDriver;
import com.fa.ort.utils.ORTDataProvider;
import com.fa.ort.utils.PropertyFileReader;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Onkar on 7/12/2017.
 */
public class Test_templet {
    private static Logger logger=Logger.getLogger(Test_templet.class);
    private static String browserName;
    public Map<String,String> configMap=null;

    public Test_templet(){configMap= PropertyFileReader.getPropertyData("ORTDetails");}


    @DataProvider(name="ORT_Data_Provider")
    public Iterator<Object[]> data(){
        try{
             return new ORTDataProvider().getData(this.getClass().getSimpleName());
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return null;
    }

    @Parameters({"browser"})
    @BeforeSuite
    public void beforeSuite(@Optional String browser){
        logger.info("Inside Before Suit method");
        try{
            browserName=browser;
            if(browserName==null){
                browserName=configMap.get("browserName");
            }
            logger.info("Browser is : "+browserName);
        }catch (Exception e){
        logger.error(e.getMessage());
        }
    }

    @BeforeTest
    public void beforeTest(){logger.info("Inside Before Test method");}

    @BeforeClass
    public void beforeClass(){
        try{

            logger.info("Inside Before Class method");
            BrowserDriver.startBrowser(browserName.toUpperCase());
            BrowserDriver.accessURL(configMap.get("url"));
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

    @BeforeMethod
    public void beforeMethod(){logger.info("Inside Before Method method");}

    @AfterMethod
    public void afterMethod(){logger.info("Inside After Method method");}

    @AfterClass
    public void afterClass(){
        try{
            logger.info("Inside After Class Method");
            Thread.sleep(5000);
            BrowserDriver.closeBrowser();
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @AfterTest
    public void afterTest(){logger.info("Inside afterTest method");}

    @AfterSuite
    public void afterSuite(){BrowserDriver.stopBrowser();}

}
