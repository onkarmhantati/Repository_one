/**
 * Created by onkar.mhantati on 10/30/2017.
 */
public class StringReverse {

    public static void main(String[] args) {


     String input= "This is String" ;
     //stringBuiltInRev(input);
     stringRev(input);
     stringRevStatment(input);

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

    public static void stringRevStatment(String str){

        String[] word=str.split(" ");
        String rev="";
       // System.out.println(word.length);
        for(int i=word.length-1;i>=0;i--){
            rev=rev+word[i];
            rev=rev+" ";
        }
        System.out.println(rev);
    }



}

