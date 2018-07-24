package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


/**
 * Created by onkar.mhantati on 6/11/2018.
 */
public class MultiTab {

    public static void main(String args[]){
        Set<String> allWindows;
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/onkar.mhantati/Downloads/page1.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a")).click();
        String currentWin=driver.getWindowHandle();
        driver.findElement(By.xpath("//a")).click();
        allWindows=driver.getWindowHandles();
        for (String str:allWindows){
            System.out.println(str);
        }
        System.out.println(currentWin);

    }
}
