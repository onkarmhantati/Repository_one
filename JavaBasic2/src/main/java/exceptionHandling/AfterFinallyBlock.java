package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by onkar.mhantati on 5/25/2018.
 */
public class AfterFinallyBlock {
    public static void main(String[] args) throws IOException{
        try {
            System.out.println("In Try.");
            if(true){throw new FileNotFoundException("This is checked exception.");}
            //System.out.println("In try after exception.");
        }finally {
            System.out.println("IN finally.");
        }
        System.out.println("In Main.");
    }
}
