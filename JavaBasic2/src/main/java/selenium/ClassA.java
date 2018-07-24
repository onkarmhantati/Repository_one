package selenium;

import org.testng.annotations.Test;

/**
 * Created by onkar.mhantati on 7/12/2018.
 */
public class ClassA {

    @Test(priority = 1)
    public void testA1(){
        System.out.println("In A1.");
    }

    @Test(priority = 2)
    public void testA2(){
        System.out.println("In A2.");
    }

    @Test(priority = 3)
    public void testA3(){
        System.out.println("In A3.");
    }

}
