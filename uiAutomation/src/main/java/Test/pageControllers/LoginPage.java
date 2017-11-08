package Test.pageControllers;
import Test.GuiControl;

/**
 * Created by onkar.mhantati on 9/11/2017.
 */
public class LoginPage extends BasePage{
    public GuiControl userName=new GuiControl(elementMap.get("userName"));
    public GuiControl PassWord=new GuiControl(elementMap.get("password"));
    public GuiControl btnClick=new GuiControl(elementMap.get("clickbtn"));


    public void LogIn(){



    }

}
