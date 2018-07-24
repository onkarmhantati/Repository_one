/**
 * Created by onkar.mhantati on 1/31/2018.
 */
public class TestJava {
    public static void main(String[] args) {
        String str = "This123 is 45ok";
        System.out.println("Addition of all Int From String:" + new SumOfIntFromString().intAddFromString(str));
    }
}

class SumOfIntFromString {
    int onlyInt[] = new int[122];

    public void resetAllInt(){
        for (int i=0;i<57;i++){
            onlyInt[i]=1;
        }
    }
    public int intAddFromString(String str) {
        int result = 0;
        String world[]= str.split(" ");
        for (int i=0;i<world.length-1;i++){
            for (int j=0;j<world[i].length();j++){
                if(onlyInt[world[i].charAt(j)]==1){

                }
            }
        }

        return result;
    }
}
