/**
 * Created by onkar.mhantati on 3/30/2018.
 */
public class OverloadingTest {
    public void display(int i,float f){
        System.out.println(i+","+f);
    }
    public void display(float i,int i2){
        System.out.println(i+","+i2);
    }

    public void display(double f){
        System.out.println(f);
    }
    public void display(char c){
        System.out.println(c);
        int String=1;
        System.out.println(String);
    }

    public static void main(String[] args) {
        OverloadingTest t=new OverloadingTest();
       // t.display(12,32);
        t.display('a');
        t.display(23.3f);
    }
}
