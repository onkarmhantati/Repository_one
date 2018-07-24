package objectCycle;

/**
 * Created by onkar.mhantati on 5/22/2018.
 */
public class ClassA extends ClassBase {
    //public ClassB classB =new ClassB();
    ClassB classB=null;

    public ClassA(){
        super();
        System.out.println("In A");

    }

    public void setObject(){classB=new ClassB();}

    public void displayForA(){
        System.out.println("In Method A.");
    }
    public void display(){
        setObject();
        classB.displayB();

    }
}
