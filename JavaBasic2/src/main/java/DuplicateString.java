import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by onkar.mhantati on 5/11/2018.
 */
public class DuplicateString {
    public static void main(String[] args) {
        String str = "Travelling salesman";
        findDuplicate(str);
        findDuplicateSet(str);
    }

    public static void findDuplicate(String str) {
        String resultStr = "";
        int charCount[] = new int[123];
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] ==0) {
                resultStr = resultStr + str.charAt(i);
                charCount[str.charAt(i)]++;
            }
        }
        System.out.println(resultStr);
    }

    public static void findDuplicateSet(String str) {
        HashSet<Character> set=new HashSet<Character>();
        String resultStr="";
        for(int i=0;i<str.length();i++){
            if(set.add(str.charAt(i))){
                resultStr=resultStr+str.charAt(i);
            }
        }
        System.out.println(resultStr);
    }
}
