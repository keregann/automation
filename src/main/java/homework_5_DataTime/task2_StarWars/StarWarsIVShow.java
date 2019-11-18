package homework_5_DataTime.task2_StarWars;

import homework_5_DataTime.task1_Frodo_FlyTime.FlyTimeMain;

import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import static homework_5_DataTime.TimeFormat.*;

public class StarWarsIVShow {

    public static void main(String[] args) {
        long movieRunTime = 120;
        LocalDate releaseMovieDate = LocalDate.of(1977, 05, 25);
        Period period = Period.ofYears(2);
        LocalDate endMovieShow = releaseMovieDate.plus(period);
        long numOfMovieShows = getWeekEndShows(releaseMovieDate, endMovieShow);
        Duration totalDuration = Duration.ofMinutes(numOfMovieShows * movieRunTime);

        System.out.println("StarWars IV was released on : " + releaseMovieDate.getDayOfWeek());
        System.out.println("StarWars IV has been shown " + numOfMovieShows + " times during " + period.getYears() + " years");
        System.out.println("Total duration of showing : " + formatDuration(totalDuration));
        //test
        System.out.println("end date day " + endMovieShow.getDayOfWeek());

    }

    private static long getWeekEndShows(LocalDate startDate, LocalDate endDate) {
        Predicate<LocalDate> isSaturday = e -> e.getDayOfWeek().equals(DayOfWeek.SATURDAY);
        Predicate<LocalDate> isSunday = e -> e.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        List<LocalDate> localDateList = Stream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .map(startDate::plusDays)
                .collect(Collectors.toList());
        if (startDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || startDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return localDateList.stream().filter(isSunday.or(isSaturday)).count();
        } else {
            return localDateList.stream().filter(isSunday.or(isSaturday)).count() + 1;
        }
    }
}