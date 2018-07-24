package threadExample;

/**
 * Created by onkar.mhantati on 5/25/2018.
 */
public class ThreadTest {
    public static void main(String args[]){
        NewThread t1=new NewThread();
        NewThread t2 =new NewThread();
        t2.start();
        t1.start();
    }
}

class NewThread extends Thread{
    public void run(){
        for(int x=0;x<5;x++)
        System.out.println(x);

    }
}