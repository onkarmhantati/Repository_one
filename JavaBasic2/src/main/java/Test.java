import java.util.ArrayList;
import java.util.List;

/**
 * Created by onkar.mhantati on 11/17/2017.
 */
public class Test {
    public static void main(String[] args) {
        String environment = System.getProperty("environment");
        System.out.println(environment);
        int x=10,y=46;
        float z=(float)23.5;
        System.out.println(x+" "+z);

        List e = new ArrayList();
        e.add("asd");
        e.add(43);
        e.add('e');
        e.add(34.765);
        System.out.println(e);
    }
}
