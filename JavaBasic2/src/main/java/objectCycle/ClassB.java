package objectCycle;

/**
 * Created by onkar.mhantati on 5/22/2018.
 */
public class ClassB extends ClassBase {
    //public ClassA classA=new ClassA();
    public ClassA classA;

    public ClassB(){
        super();
        System.out.println("In B");
    }

    public void setForObject(){
        classA=new ClassA();
    }

    public void displayB(){
        setForObject();
        classA.displayForA();
        System.out.println("In B Method");
    }

}
