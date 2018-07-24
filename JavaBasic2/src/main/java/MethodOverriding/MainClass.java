package MethodOverriding;

/**
 * Created by onkar.mhantati on 6/6/2018.
 */
public class MainClass {
    public static void main(String[] args) {
        Bike b=new Splender();
        Splender s=new Splender();
        b.run();
        s.display();
        String no="20.4";

        float l = Float.parseFloat(no);
        System.out.println(l);

        int i=Math.round(l);
        String s2=String.valueOf(i);
        System.out.println(i);

    }
}
