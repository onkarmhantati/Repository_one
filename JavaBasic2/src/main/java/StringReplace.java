/**
 * Created by onkar.mhantati on 4/27/2018.
 */
public class StringReplace {
    public static void main(String[] args) {
        String str="aaaaabbbb";
        String str2="";
        char ch;
        for (int i=0;i<str.length();i++){
            if(str2.contains(String.valueOf(str.charAt(i)))){
                str2=str2+"@";
                continue;
            }
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);
    }
}
