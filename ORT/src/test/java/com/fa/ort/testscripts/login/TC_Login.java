package com.fa.ort.testscripts.login;


import com.fa.ort.pageControllers.LoginPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Onkar on 7/11/2017.
 */
public class TC_Login extends Test_templet {
    public static Logger logger = Logger.getLogger(TC_Login.class);

    @Test(dataProvider = "ORT_Data_Provider")
    public void validLogin(String username, String password, String message) {
        boolean result = true;
        try {
            LoginPage.login(username, password);
            System.out.println("Login successfully....");
            logger.info("Login successfully done!!!!!!");
        } catch (Exception e) {
            result = false;
            logger.info("Context: ", e);
        }
        Assert.assertTrue(result, "Test Cases fail");
    }
}
