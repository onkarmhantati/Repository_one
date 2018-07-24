/**
 * Created by onkar.mhantati on 4/16/2018.
 */
public class StringCompareToMethod {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="abcd";
        System.out.println(str1.compareTo(str2));
        str1="abcde";
        System.out.println(str1.compareTo(str2));
        str2="abcdef";
        System.out.println(str1.compareTo(str2));
    }
}
