package b_class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Time Packege 

public class Time1 {
    public static void main(String[] args) {
        
        /*
        // Date 
        LocalDate l  = LocalDate.now();
        System.out.println(l);

        // Time 
        LocalTime t = LocalTime.now();
        System.out.println(t);

        // DateTime 
        LocalDateTime dt = LocalDateTime .now();
        System.out.println(dt);

        */


        // DateTime Formatter 

        // orignal date and Time 
        LocalDateTime dt = LocalDateTime .now();
        System.out.println(dt);

        // format 
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy -- E - h:m a");
        String myDate = dt.format(df);
        System.out.println(myDate);

        // bulit 
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate1 = dt.format(df1);
        System.out.println(myDate1);

    }
}
