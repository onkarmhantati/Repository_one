/**
 * Created by onkar.mhantati on 4/3/2018.
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("In User Thread:" + i);
    }

}

public class MultiThreadingTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 10; i++)
            System.out.println("In Main Thread:" + i);
    }
}
