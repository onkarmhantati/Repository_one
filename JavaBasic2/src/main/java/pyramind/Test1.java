package pyramind;

/**
 * Created by onkar.mhantati on 6/9/2018.
 */
public class Test1 {

    public static void main(String[] args) {
       printP(10);
    }

    public static void printP(int x){
        for(int i=0;i<4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
