package com.fa.backlotv4.pages;

import com.fa.backlotv4.GuiController;
import com.fa.backlotv4.utils.XmlFileReader;

import java.util.Map;

/**
 * Created by onkar.mhantati on 9/19/2017.
 */
public class LogInPage extends BasePage {
    public static GuiController userName=new GuiController(getElementMap().get("userName"));
    public static GuiController passWord=new GuiController(getElementMap().get("password"));
    public static GuiController clickBtn=new GuiController(getElementMap().get("clickBtn"));

    public static void LogIn(String username,String password){
        try{
            userName.setText(username);
            Thread.sleep(2000);
            passWord.setText(password);
            Thread.sleep(2000);
            clickBtn.clickOnElement();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
   }
}
