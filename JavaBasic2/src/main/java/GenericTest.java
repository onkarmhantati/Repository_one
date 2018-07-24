/**
 * Created by onkar.mhantati on 4/18/2018.
 */
public class GenericTest<T> {
    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public  <T> boolean equalTo(GenericTest<T> t1,GenericTest<T> t2){
        return t1.get().equals(t2.get());
    }

    public static void main(String[] args) {
        GenericTest<String> g1=new GenericTest<>();
        g1.set("ABC");

        GenericTest<String> g2=new GenericTest<>();
        g2.set("ABC");

        GenericTest<Integer> g3=new GenericTest<>();
        g3.set(25);

        GenericTest<Integer> g4=new GenericTest<>();
        g4.set(65);

        System.out.println(g1.equalTo(g1,g2));
        System.out.println(g1.equalTo(g3,g4));
    }
}
