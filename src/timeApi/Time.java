package timeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {
        // LocalDate example
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date: " + date);

        // LocalTime example
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // LocalDateTime example
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        // ZonedDateTime example
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Africa/Lagos"));
        System.out.println("Lagos Time: " + zonedDateTime);

        // DateTimeFormatter example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Duration example
        Duration duration = Duration.between(LocalTime.NOON, LocalTime.now());
        System.out.println("Duration since Noon: " + duration.toHours() + " hours");

        // Period example
        Period period = Period.between(LocalDate.of(2020, 1, 1), LocalDate.now());
        System.out.println("Period since 2020-01-01: " + period.getYears() + " years");
    }
}
