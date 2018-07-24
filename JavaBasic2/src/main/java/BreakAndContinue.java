/**
 * Created by onkar.mhantati on 4/25/2018.
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            System.out.println(i);
            if(i==2)
                break;
        }
        for(int j=0;j<5;j++){
            if(j==3)
                continue;
            System.out.println(j);
        }
        System.out.println("Hello");

    }
}
