/**
 * Created by onkar.mhantati on 4/30/2018.
 */
class SubString {
    String str = "aaxaabbxbcccabycdabycdt";
    String subString = "";
    String preSubString = "";
    int preMax = 0;
    int max = 0;
    int flag[] = new int[122];


    public void resetAllFlags() {
        for (int i = 0; i < flag.length; i++) {
            flag[i] = 0;
        }
    }

    public void findSubString() {
        resetAllFlags();
        int i = 0;
        int j = 0;
        while (i < str.length()) {
            flag[str.charAt(i)]=flag[str.charAt(i)]+1;
            if (flag[str.charAt(i)]>1) {
                if (preMax < max) {
                    preMax = max;
                    preSubString = subString;
                }
                max = 0;
                subString = "";
                j++;
                i = j;
                resetAllFlags();
                continue;
            }
            subString = subString + str.charAt(i);
            max = max + 1;
            i++;
        }
        if (preMax < max) {
            preMax = max;
            preSubString = subString;
        }

    }

    public void displaySubString(){
        System.out.println("Char length: "+preMax+": "+preSubString);
    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        SubString obj=new SubString();
        obj.findSubString();
        obj.displaySubString();
    }
}

