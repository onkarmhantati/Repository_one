package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by onkar.mhantati on 6/7/2018.
 */
public class ActionClassTest {
    public static void main(String args[]){

        try {
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("file:///C:/Users/onkar.mhantati/Downloads/page1.html");
            Thread.sleep(10000);
            driver.manage().window().maximize();
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath("//ul[@id='menu-top']//li[4]//a[contains(text(),'Languages')]"))).build().perform();
            action.click(driver.findElement(By.xpath("//ul[@id='menu-top']//li[4]//ul//li[3]//a"))).build().perform();
            String name=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
            System.out.println(name);
            driver.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
