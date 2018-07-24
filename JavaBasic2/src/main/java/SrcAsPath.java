import java.io.File;

/**
 * Created by onkar.mhantati on 3/23/2018.
 */
public class SrcAsPath {
    public static void main(String[] args) {
        String imgPath="LeftArrow.png";
        File file = new File(("src/main/resources" +imgPath));
        System.out.println(file.getAbsolutePath());
    }
}
