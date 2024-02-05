import java.time.LocalDate;
import java.time.LocalTime;

public class FormatDates {
    public static void main(String[] var0){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date);

        int year = date.getYear();
        int day = date.getDayOfWeek().getValue();

        int hour =  time.getHour();
        int minute =  time.getMinute();
        int second =  time.getSecond();
        int nanoSecond =  time.getNano();

        String timeOfDay = "A.M";
        if( hour == 0){
            hour = 12;
        }
        if (hour > 12){
            hour -= 12;
            timeOfDay = "P.M.";
        }
        System.out.println(day);
        System.out.println(hour + " " + timeOfDay);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nanoSecond);
        System.out.println(year);
    }
}
