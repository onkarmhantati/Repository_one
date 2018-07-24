/**
 * Created by onkar.mhantati on 3/30/2018.
 */

class A {
    int x, y;
    public  void displayA() {
//        x=10;
//        y=20;
        System.out.println("In Parent");
    }
}

class B extends A {
    int z;
    public  void displayA() {
        // z=30;
        System.out.println("In child");
    }
}

//    public int displayA(){
//        return 0;
//    }
public class InheritanceTest {
    public static void main(String[] args) {
        A a = new B();
        a.displayA();


    }


}

