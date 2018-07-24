/**
 * Created by onkar.mhantati on 5/23/2018.
 */
public class IntPalindrome {
    public static void main(String[] args) {
        int x=12156785;
        if(x==getIntReverse(x))
            System.out.println(x+" is palindrome.");
        else
            System.out.println(x + " is NOT palindrome.");
    }

    static int getIntReverse(int x){
        int reverse=0;
        int d;
        while(x>0){
            d=x%10;
            x=x/10;
            reverse=(reverse*10)+d;
        }
        return reverse;
    }
}
