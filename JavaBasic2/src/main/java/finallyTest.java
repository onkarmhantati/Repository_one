/**
 * Created by onkar.mhantati on 4/18/2018.
 */
public class finallyTest {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String ("abc");
        String s3="abc";
        String s4="abc";
        String s5=s3;
        s3="xyz";
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s5);
    }
}
