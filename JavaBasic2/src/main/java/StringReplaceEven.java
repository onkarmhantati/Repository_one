/**
 * Created by onkar.mhantati on 4/27/2018.
 */
public class StringReplaceEven {
    public static void main(String[] args) {
        String str1 = "abcabcabcabcabc";
        String str2 = "";
        int even[] = new int[122];

        for (int i = 0; i < even.length; i++) {
            even[i] = 0;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(String.valueOf(str1.charAt(i)))) {
                if (even[str1.charAt(i)] == 0) {
                    str2 = str2 + "@";
                    even[str1.charAt(i)] = 1;
                    continue;
                } else {
                    str2 = str2 + str1.charAt(i);
                    even[str1.charAt(i)] = 0;
                    continue;
                }
            }
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}
