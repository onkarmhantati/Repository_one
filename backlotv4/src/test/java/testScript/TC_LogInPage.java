package testScript;

import com.fa.backlotv4.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by onkar.mhantati on 9/19/2017.
 */
public class TC_LogInPage extends Test_Templet{


 @Test(dataProvider = "V4_Data_Provider")
 public void validLogin(String username,String password){
       boolean result=false;
       try {
           LogInPage.LogIn(username,password);
       }catch (Exception e){
           e.printStackTrace();
       }
     Assert.assertTrue(result,"Test cases Fail");
 }
}
