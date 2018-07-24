/**
 * Created by onkar.mhantati on 5/8/2018.
 */
import java.util.regex.*;
public class RegularExpression {
    public static void main(String[] args) {
        String str="aaabba125bcd";
        String outStr=str.replaceAll("[a-zA-Z]","?");
        Pattern.compile("[0-9]");
        System.out.println(outStr);
    }
}
