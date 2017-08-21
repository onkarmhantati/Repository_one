/**
 * Created by onkar.mhantati on 8/18/2017.
 */
public class DefaultException {


        public static void main(String[]args) {
            try {
                doTask();
            } catch (Exception e) {
                System.out.println("In main try");
            }
            //doTask();
        }

    public static void doTask(){
        doAnotherTask();

        //System.out.println("In doTask");
    }
    public static void doAnotherTask(){
        System.out.printf("Task Done");
        System.out.println(10/0);
    }
}
