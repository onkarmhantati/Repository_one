package com.fa.ort.pageControllers;

import com.fa.ort.GuiControl;
import org.apache.log4j.Logger;

/**
 * Created by Onkar on 7/12/2017.
 */
public class LoginPage extends PageControl {
    public static Logger logger =Logger.getLogger(LoginPage.class);

    public static GuiControl txtUserName=new GuiControl(getElementConfig("txtUserName"));
    public static GuiControl txtPassword =new GuiControl((getElementConfig("txtPassword")));
    public static GuiControl btnLogin=new GuiControl(getElementConfig("btnLogin"));


    public static void login(String username,String password){
        logger.info("Inside Login Method");
        txtUserName.waitForElementToVisible(10);
        txtUserName.setText(username);
        logger.info("Entered UserName: "+username);
        txtPassword.setText(password);
        logger.info("Entered Password: "+password);
        btnLogin.click();
    }
}
