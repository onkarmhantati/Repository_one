package pyramind;

/**
 * Created by onkar.mhantati on 12/20/2017.
 */
public class Pyramid {
    public Pyramid(){}
    public static void main(String[] args) {
        int length=3;
        for(int i=1;i<=length+2;i++){
            for(int k=0;k<length-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
            length--;
        }
    }
}
