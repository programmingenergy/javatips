package energy.programming.javatips;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import static java.lang.System.out;

public class ChronoUnitExamples {

    public static void main(String[] args){
        LocalDate startDate = LocalDate.of(1972, Month.MARCH, 25);
        LocalDate endDate = LocalDate.of(2018, 10, 15);
        out.println("Two dates, difference in days, months and years");
        out.println("years: " + ChronoUnit.YEARS.between(startDate, endDate));
        out.println("months: " + ChronoUnit.MONTHS.between(startDate, endDate));
        out.println("days: " + ChronoUnit.DAYS.between(startDate, endDate));
    }
}
