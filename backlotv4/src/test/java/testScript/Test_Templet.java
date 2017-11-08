package testScript;

import com.fa.backlotv4.utils.BrowserDriver;
import com.fa.backlotv4.utils.PropertieFileReader;
import com.fa.backlotv4.utils.V4DataProvider;
import org.testng.annotations.*;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by onkar.mhantati on 9/19/2017.
 */
public class Test_Templet {

    private static String browserName;
    public Map<String,String> configMap=null;

    public Test_Templet(){
        configMap= PropertieFileReader.getPropertiesData("BacklotV4Configure");
    }

    @DataProvider(name = "V4_Data_Provider")
    public Iterator<Object[]>data(){
        try{
            return new V4DataProvider().getTestData(this.getClass().getSimpleName());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Parameters({"browser"})
    @BeforeSuite
    public void beforeSuite(@Optional String browser){
        try {
                browserName=browser;
                if(browserName==null){
                    browserName=configMap.get("browserName");
                }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @BeforeClass
    public void beforeClass(){
        try{
            BrowserDriver.startBrowser();
            BrowserDriver.accessUrl(configMap.get("url"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void afterClass(){
        BrowserDriver.closeBrowser();
    }

}
