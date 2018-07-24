import static java.lang.Character.isDigit;

/**
 * Created by onkar.mhantati on 2/13/2018.
 */
public class IntFromStringAdd {
    public static void main(String[] args) {

        String str = "2wtrsf2 er3d25";
        //addAllIntReg(str);
        addAllIntNormal(str);

    }

    public static void addAllIntReg(String str) {
        int result = 0;
        String buffer = str.replaceAll("[A-Z,a-z, ]", ",");
        System.out.println(buffer);
        String world[] = buffer.split(",");
        for (int i = 0; i < world.length; i++) {
            if (!(world[i].equalsIgnoreCase("")))
                result = result + Integer.parseInt(world[i]);
        }
        System.out.println(result);
    }

    public static void addAllIntNormal(String str) {
        String temp = "";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            } else {
                if (temp.isEmpty() == false) {
                    result += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (temp.isEmpty() == false) {
            result = result + Integer.parseInt(temp);
        }
        System.out.println(result);
    }
}

