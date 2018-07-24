package factorymethodTest;

import java.io.IOException;

/**
 * Created by onkar.mhantati on 5/29/2018.
 */
public class FactoryTest {
    public static Test getTest() {
        try {
            return new ClassB();
        } catch (Exception e) {
            Test t = new ClassA();
            System.out.println("Could not instantiate ClassB: " + e.getMessage());
            return t;
        }
    }
}
