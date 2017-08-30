package com.fa.ort.testscripts.login;


import com.fa.ort.pageControllers.LoginPage;
import com.fa.ort.pageControllers.PageControl;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Created by Onkar on 7/11/2017.
 */
public class TC_Login extends Test_templet{
    public static Logger logger=Logger.getLogger(TC_Login.class);

    @Test
    public void validLogin(){
        boolean result=true;
        try{
            LoginPage.login(configMap);
            //LoginPage.login();
        }catch (Exception e){

        }

    }
}
