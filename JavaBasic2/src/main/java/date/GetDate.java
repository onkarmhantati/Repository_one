package date;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by onkar.mhantati on 6/12/2018.
 */
public class GetDate {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String str=formatter.format(date);


        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 5); // Adding 5 days
        String output = formatter.format(c.getTime());
        System.out.println(output);
        System.out.println(str);


    }

}


