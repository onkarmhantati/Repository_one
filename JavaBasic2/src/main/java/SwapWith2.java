/**
 * Created by onkar.mhantati on 1/25/2018.
 */
public class SwapWith2 {
    public static void main(String[] args) {
        int x,y;
        x=1;
        y=3;
        System.out.println("Before Swap.");
        System.out.println("x: "+x+"Y: "+y);
        System.out.println("After Swap.");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x: "+x+"y: "+y);
    }
}
