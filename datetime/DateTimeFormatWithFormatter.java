package datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;
public class DateTimeFormatWithFormatter {
    public static void main(String[] args){
        // LocalDateTime now = LocalDateTime.now();
        // DateTimeFormatter df1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
        // System.out.println(now.format(df1));

        // DateTimeFormatter df2 = DateTimeFormatter.ofPattern("d-MM-yy HH:mm");
        // System.out.println(now.format(df2));

        // DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        // LocalDate date = LocalDate.parse("01/02/03 3:54 pm", df1);
        // System.out.println(date);

        // DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd MMM yyyy h:mm a");
        // System.out.println(date.format(df2));

        // DateTimeFormatter df1 = DateTimeFormatter.ofPattern("d MMM yyyy h:mm a");
        // LocalDateTime dt = LocalDateTime.parse("6 Jan 2020 3:54 pm", df1);
        // DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // System.out.println(df2.format(dt));

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd MMM yyyy h:mm a");
        LocalDateTime dt = LocalDateTime.parse("06 February 2020 3:54 pm", df1);
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(df2.format(dt));
    }
}
