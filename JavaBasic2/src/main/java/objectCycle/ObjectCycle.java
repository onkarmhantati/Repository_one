package objectCycle;

/**
 * Created by onkar.mhantati on 5/22/2018.
 */
public class ObjectCycle {
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        System.out.println("In Main");
        classB.displayB();

    }

}
