/**
 * Created by onkar.mhantati on 10/30/2017.
 */
public class StringReverse {

    public static void main(String[] args) {
     String input= "This is String" ;
//     stringBuiltInRev(input);
     stringRev(input);
    stringRevStatement(input);
        stringRevWorld(input);
   stringRevChar(input);
    }

    public static void stringBuiltInRev(String str){
        StringBuilder str1=new StringBuilder();
        str1.append(str);
        str1=str1.reverse();
        System.out.println(str1);
    }

    public static void stringRev(String str){
        String rev="";
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
    }

    public static void stringRevStatement(String str){

        String[] word=str.split(" ");
        String rev="";
       // System.out.println(word.length);
        for(int i=word.length-1;i>=0;i--){
            rev=rev+word[i];
            rev=rev+" ";
        }
        System.out.println(rev);
    }

    public static void stringRevWorld(String str){
        String[] word=str.split(" ");
        String rev="";
        for (int i=0;i<word.length;i++){
            for (int j=(word[i].length()-1);j>=0;j--){
                rev=rev+word[i].charAt(j);
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }

    public static void stringRevChar(String str){
        char a[]=str.toCharArray();
        String rev="";
       for (int i=a.length-1;i>=0;i--){
           rev=rev+a[i];
       }
        System.out.println(rev);
    }
}

