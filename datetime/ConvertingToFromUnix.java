package datetime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;
public class ConvertingToFromUnix {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.of(2020, 1, 1, 0, 0);
        ZoneId sgZone = ZoneId.of("Asia/Singapore");
        ZonedDateTime dtz = ZonedDateTime.of(dt, sgZone);
        System.out.println(dtz);
        System.out.println(dtz.toEpochSecond());
        converFromTimestamp();
    }

    static void converFromTimestamp(){
        long ts = 1577808000;
        Instant i = Instant.ofEpochMilli(ts);

        ZoneId sgZone = ZoneId.of("Asia/Singapore");
        ZonedDateTime sgdt = ZonedDateTime.ofInstant(i, sgZone);

        ZoneId nyZone = ZoneId.of("America/New_York");
        ZonedDateTime nydt = ZonedDateTime.ofInstant(i, nyZone);
        System.out.println("Timestamp "+ ts + " equals to both: ");
        System.out.println(sgdt);
        System.out.println(nydt);
    }

    
}
