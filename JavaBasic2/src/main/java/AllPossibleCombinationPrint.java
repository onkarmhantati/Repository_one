/**
 * Created by onkar.mhantati on 5/11/2018.
 */
public class AllPossibleCombinationPrint {
    public static void main(String[] args) {
        String name="abcde";
        printAllCombination(name);
    }

    public static void printAllCombination(String name){
        int count=0;
        char[] swapName=name.toCharArray();
        for(int i=0;i<=name.length()-1;i++){
            for(int j=name.length()-1;j>=0;j--){
                char temp;
                temp=swapName[j];
                swapName[j]=swapName[i];
                swapName[i]=temp;
                count++;
                System.out.print(count+" : ");
                System.out.println(swapName);
                swapName=name.toCharArray();
            }
        }
    }
}
