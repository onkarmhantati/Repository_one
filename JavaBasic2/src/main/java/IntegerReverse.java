/**
 * Created by onkar.mhantati on 2/13/2018.
 */
public class IntegerReverse {
    int xyz=0;
    void display(){
        System.out.println(xyz);
    }

    public static void main(String[] args) {
        IntegerReverse bog1=new IntegerReverse();
        bog1.display();

        int num=12345;
        System.out.println("Integer Value before reverse: "+num);
        System.out.println("Integer Value After reverse: "+reverseInt(num));
    }

    public static int reverseInt(int num){
        int revNum=0;
        while (num>0){
            revNum=revNum*10 + num%10;
            num=num/10;
        }
        return revNum;
    }
    IntegerReverse(){
        xyz=10;
    }
}
