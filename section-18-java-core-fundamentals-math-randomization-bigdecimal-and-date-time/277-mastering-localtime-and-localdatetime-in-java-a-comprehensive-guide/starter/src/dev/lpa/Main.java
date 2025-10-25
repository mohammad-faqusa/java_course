package dev.lpa;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate FiveS = LocalDate.of(2022, 5, 5);
        System.out.println(FiveS);

        LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
        System.out.println(May5th);

        LocalDate Day125 = LocalDate.ofYearDay(2022, 125);
        System.out.println(Day125);

        LocalDate May5 = LocalDate.parse("2022-05-05");
        System.out.println(May5);

        System.out.println(May5.getYear());
        System.out.println(May5.getMonth());
        System.out.println(May5.getMonthValue());

        System.out.println(May5.getDayOfMonth());
        System.out.println(May5.getDayOfWeek());
        System.out.println(May5.getDayOfYear());


        System.out.println(May5.get(ChronoField.YEAR));

        System.out.println(May5.withYear(2000));

        System.out.println(May5.plusYears(5));
        System.out.println(May5);

        System.out.println(May5.plus(300, ChronoUnit.DAYS));


        System.out.println("May5 is > today : " + May5.isAfter(LocalDate.now()));

        System.out.println("is leap year ? " + May5.isLeapYear());

        May5.datesUntil(May5.plusDays(50), Period.ofDays(7)).forEach(System.out::println);
        May5.datesUntil(May5.plusDays(50), Period.ofDays(7)).forEach(System.out::println);


        // LocalTime

        LocalTime sevenAm = LocalTime.of(7, 0);
        System.out.println(sevenAm);

        LocalTime tim1 = LocalTime.parse("19:00");
        System.out.println(tim1);

        System.out.println(tim1.get(ChronoField.AMPM_OF_DAY));

        System.out.println(tim1.get(ChronoField.HOUR_OF_DAY));

        System.out.println(tim1.plus(2, ChronoUnit.HOURS));

        System.out.println(tim1.range(ChronoField.HOUR_OF_DAY));
        System.out.println(tim1.range(ChronoField.MINUTE_OF_HOUR));
        System.out.println(tim1.range(ChronoField.MINUTE_OF_DAY));
        System.out.println(tim1.range(ChronoField.SECOND_OF_DAY));

        LocalDateTime todayAndNow = LocalDateTime.now();
        System.out.println(todayAndNow);

        LocalDateTime May5Noon = LocalDateTime.of(2022, 5, 5, 12, 0);
        System.out.println(May5Noon);

        System.out.println(todayAndNow.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(todayAndNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(todayAndNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

    }
}
