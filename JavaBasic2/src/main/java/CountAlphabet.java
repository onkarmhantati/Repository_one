/**
 * Created by onkar.mhantati on 11/1/2017.
 */
public class CountAlphabet {

    public static void main(String[] args) {

        String input="this is sample string";

       countAlphabet(input);

    }

    public static void countAlphabet(String str) {

                 int flag=0;

          for (int i = 0; i <= str.length() - 1; i++) {
                 int count = 0;
              for (int j = 0; j <= str.length() - 1; j++) {
                  if (str.charAt(i) == str.charAt(j)) {
                    count++;
                  }
              }
              if(i==0){
                System.out.println(str.charAt(i) + " : " + count);
              }else {
                  flag=0;
                  for (int p = i - 1; p >= 0; p--) {
                      if (str.charAt(p) == str.charAt(i)) {
                        flag++;
                      }
                  }
                  if (flag == 0) {
                        System.out.println(str.charAt(i) + " : " + count);
                  }
                }

          }
    }

}
