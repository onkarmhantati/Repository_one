package pyramind;

import java.lang.reflect.Constructor;
import pyramind.Pyramid;

/**
 * Created by onkar.mhantati on 5/24/2018.
 */
public class Pyramid2 {
    public static void main(String args[]) {

//        pyramidRight(5);
//        pyramidLeft(5);
//        pyramidCentre(6);
        pyramidInt(5);
//        try {
////            Class class2=Class.forName("Pyramid");
////            System.out.println(class2.getName());
//            Class c=Class.forName("Pyramid2");
//            //Constructor constructor=new Constructor();
//            Pyramid2 pyramid2=(Pyramid2)c.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    static void pyramidRight(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pyramidLeft(int n) {
        int k = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pyramidCentre(int n) {
        int k = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k / 2; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pyramidInt(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

}
