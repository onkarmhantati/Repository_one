/**
 * Created by onkar.mhantati on 4/14/2017.
 */
public class SystemInformation {
    public static void main(String[] args) {
        String osName ="os.name";
        String osVersion ="os.version";
        String osArchitecture ="os.arch";

        System.out.println("The Information about OS");

        System.out.println("Name of Operating System :" +System.getProperty(osName));
        System.out.println("Version of Operating System :" +System.getProperty(osVersion));
        System.out.println("Architecture of Operating System :" +System.getProperty(osArchitecture));
    }
}
