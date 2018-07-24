package selenium;

import org.testng.annotations.Test;

/**
 * Created by onkar.mhantati on 7/12/2018.
 */
public class ClassB {

    @Test(priority = 1)
    public void testB1(){
        System.out.println("In B1.");
    }

    @Test(priority = 2)
    public void testB2(){
        System.out.println("In B2.");
    }

    @Test(priority = 3)
    public void testB3(){
        System.out.println("In B3.");
    }
}
