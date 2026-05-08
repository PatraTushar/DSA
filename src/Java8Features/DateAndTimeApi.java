package Java8Features;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTimeApi {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());


        LocalDate date = LocalDate.of(2026, 1, 15);
        System.out.println(date);  // 2026-01-15
        System.out.println(date.plusDays(5));   // 2026-01-20
        System.out.println(date.minusMonths(2));  // 2025-11-15
        System.out.println(date.plusYears(1)); //  2027-01-15

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());


        // Create Custom Time
        LocalTime t = LocalTime.of(10, 30, 45);
        System.out.println(t);

       // LocalDateTime → Date + Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        // Custom Date and Time
        LocalDateTime dt = LocalDateTime.of(2026, 5, 8, 10, 30);
        System.out.println(dt);


        // Formatting Date and Time
        LocalDate d = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatted = d.format(formatter);

        System.out.println(formatted);


        // Parse String to Date
        String str = "08-05-2026";

        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dd = LocalDate.parse(str, f);

        System.out.println(dd);    // LocalDate uses its default format:yyyy-MM-dd


        // Period → Difference Between Dates

        LocalDate birth = LocalDate.of(2003, 5, 10);
        LocalDate t1 = LocalDate.now();

        Period age = Period.between(birth, t1);

        System.out.println(age.getYears());

        // Duration → Difference Between Time
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration d2 = Duration.between(start, end);

        System.out.println(d2.toHours());
        System.out.println(d2.toMinutes());

        // ZonedDateTime → Timezone
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        // Get Time of Another Country
        ZonedDateTime usa =
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(usa);

    }
}
