import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    public static String getCurrentDate() {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return f.format(date);
    }

}
