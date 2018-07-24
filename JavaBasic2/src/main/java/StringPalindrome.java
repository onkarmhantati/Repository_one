/**
 * Created by onkar.mhantati on 5/23/2018.
 */
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Mom";
        if (getPalindromeInline(str))
            System.out.println("String: " + str + " is Palindrome.");
        else
            System.out.println("String : " + str + " is NOT palindrome. ");
    }

    static boolean getPalindromeSB(String str) {
        StringBuilder strRev = new StringBuilder();
        strRev.append(str);
        strRev = strRev.reverse();
        if (strRev.toString().equals(str))
            return true;
        return false;
    }

    static boolean getPalindromeInline(String str) {
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(strRev))
            return true;
        else
            return false;
    }
}
