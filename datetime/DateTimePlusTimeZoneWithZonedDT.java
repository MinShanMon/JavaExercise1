package datetime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimePlusTimeZoneWithZonedDT {
    public static void main(String[] args) {
        //Time with customize and customize location
        // LocalDateTime dt = LocalDateTime.of(2020, 9,8,0,0,0,0);
        // ZoneId sgZone = ZoneId.of("Asia/Singapore");
        // ZonedDateTime dtWithTz = ZonedDateTime.of(dt, sgZone);
        // System.out.println("Time in SG");
        // System.out.println(dtWithTz);

        
        //JapanCurrent time
        // ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        // ZonedDateTime tokyoTime = ZonedDateTime.now(tokyoZone);
        // System.out.println("Time in Tokyo");
        // System.out.println(tokyoTime);

        //time in current machine
        // ZonedDateTime now = ZonedDateTime.now();
        // System.out.println("Time in current machine");
        // System.out.println((now));

        // LocalDateTime dt = LocalDateTime.of(2020, 1, 1, 8, 10);
        // ZoneId sgZone = ZoneId.of("Asia/Singapore");
        // ZonedDateTime start = ZonedDateTime.of(dt,sgZone);
        // System.out.println("Flight started at" + start);

        // ZoneId nyZone = ZoneId.of("America/New_York");
        // ZonedDateTime end = start.plusHours(18).plusMinutes(10).withZoneSameInstant(nyZone);
        // System.out.println("and landed at " + end);


        //testing
        // ZonedDateTime sgnow = ZonedDateTime.now();
        // System.out.println("start time: " + sgnow);        
        // ZoneId nyZone = ZoneId.of("America/New_York");
        // ZonedDateTime usnow = ZonedDateTime.now(nyZone);
        // System.out.println("time in us" + usnow); 
        // ZonedDateTime end = sgnow.plusHours(18).plusMinutes(10).withZoneSameInstant(nyZone);
        // System.out.println("arrival" + end);
    }
}
