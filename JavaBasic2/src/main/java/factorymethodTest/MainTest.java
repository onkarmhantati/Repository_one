package factorymethodTest;

/**
 * Created by onkar.mhantati on 5/29/2018.
 */
public class MainTest {

    public static void main(String args[]) {

        ClassA classA = new ClassA();
        classA.display();
        Test test=FactoryTest.getTest();
        test.display();
    }

}
