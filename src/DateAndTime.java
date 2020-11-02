import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    public static String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return formatter.format(date);
    }

    public static String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

}
