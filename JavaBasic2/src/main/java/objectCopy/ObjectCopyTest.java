package objectCopy;

/**
 * Created by onkar.mhantati on 6/5/2018.
 */
public class ObjectCopyTest {
    int id = 0;
    String name = "Abc";

    public ObjectCopyTest() {
        id = 0;
        name = null;
    }

    public ObjectCopyTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ObjectCopyTest(ObjectCopyTest copyTest){
        id=copyTest.id;
        name=copyTest.name;
    }

    public void display(){
        System.out.println("Id: " +id);
        System.out.println("Name: "+name);
    }

    public static void main(String args[]){
        ObjectCopyTest obj1=new ObjectCopyTest();
        obj1.display();
        ObjectCopyTest obj2=new ObjectCopyTest(3,"Om");
        obj2.display();
        ObjectCopyTest objectCopyTest=new ObjectCopyTest(obj1);
        ObjectCopyTest obj3=new ObjectCopyTest(5,"Onkar");
        obj3.display();
        objectCopyTest.display();
        obj1=obj2;
        obj1.display();

    }
}
