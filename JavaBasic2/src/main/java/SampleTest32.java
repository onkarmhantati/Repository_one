/**
 * Created by onkar.mhantati on 5/28/2018.
 */
public class SampleTest32 {


    int a = m1(); ;
    {
        System.out.println("instance block");
        System.out.println(a);
    } //instance block

          //instance variables
       int m1() {
        System.out.println("m1() method called by variable");
        return 100;
    }


    public static void main(String[] args) {
        System.out.println(new SampleTest32());
    }
}

