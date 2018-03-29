import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatting {

    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    public static DateTimeFormatter dateFormatter (){
        return DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.ENGLISH);
    }
}



//    having trouble with dates: https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html

//    to convert a string to a date: date = valueOf("yyyy-mm-dd")