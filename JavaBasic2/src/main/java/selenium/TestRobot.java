package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by onkar.mhantati on 6/13/2018.
 */
public class TestRobot {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.harmonytoc.forgeahead.io/" +
                "");
        driver.findElement(By.xpath("//input[@id='lst-ib']")).click();

    }
}
