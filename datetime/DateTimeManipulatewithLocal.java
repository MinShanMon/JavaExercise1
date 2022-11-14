package datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeManipulatewithLocal {
    public static void main(String[] args){
        // LocalDateTime curDateTime = LocalDateTime.now();
        // System.out.println(curDateTime);

        // LocalDateTime aYearEnd = LocalDateTime.of(2019, 12, 31, 11, 59, 59);
        // System.out.println(aYearEnd);

        //demo2 adding date time and remove date time
        // LocalDateTime dt = LocalDateTime.of(2020, 6, 15, 12, 0, 0);
        // System.out.println(dt);

        // LocalDateTime newDt = dt.withYear(dt.getYear() +1).minusMonths(2).minusDays(3).plusHours(4).plusMinutes(5).plusSeconds(6);
        // System.out.println(newDt);
        
        //comapre timeline
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // LocalDateTime date1 = LocalDateTime.parse("01/02/2020 00:00",df);
        // LocalDateTime date2 = LocalDateTime.parse("02/02/2020 00:00", df);

        // System.out.println(date1.isBefore(date2));
        // System.out.println(date1.isAfter(date2));
        // System.out.println(date1.isEqual(date2));


    }

}
