package b_class;

// Calender Class in Java 
import java.util.*;

public class calender1 {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());

         Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());         // gregory
        //  System.out.println(c.getTimeZone().getID());  // Asia/Calcutta

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));


        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // GregorianCalendar :- 

        GregorianCalendar cd = new GregorianCalendar();
        System.out.println(cd.isLeapYear(2021));

        // Time Zone :-- 

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[8]);
    }
}
