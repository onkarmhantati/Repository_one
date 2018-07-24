import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;


/**
 * Created by onkar.mhantati on 2/8/2018.
 */
public class StringToDate {
    public static void main(String[] args) {
        String sDate="02/08/2018 10:57:44";
        Date d=stringToDate(sDate);
        System.out.println(d);
    }

    public static Date stringToDate(String sdate){
       return DateTime.parse(sdate, DateTimeFormat.forPattern("dd/MM/yyyy hh:mm:ss").withLocale(Locale.US)).toDate();
    }
}
