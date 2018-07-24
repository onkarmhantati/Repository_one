import java.util.Random;

/**
 * Created by onkar.mhantati on 12/12/2017.
 */
public class randomString {
    public static void main(String[] args) {
       Random r =new Random();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<5;i++){
           char c=(char)(r.nextInt(128-32)+32);
           sb.append(c);
       }
        System.out.println(sb.toString());
    }
}
