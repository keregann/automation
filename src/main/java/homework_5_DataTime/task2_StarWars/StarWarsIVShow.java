package homework_5_DataTime.task2_StarWars;

import java.time.*;
import java.time.temporal.*;
import static homework_5_DataTime.TimeFormat.*;

public class StarWarsIVShow {

    public static void main(String[] args) {
        long movieRunTime = 120;
        LocalDate releaseMovieDate = LocalDate.of(1977, 05, 25);
        Period period = Period.ofYears(2);
        LocalDate endMovieShowDate = releaseMovieDate.plus(period);
        long numOfMovieShows = (ChronoUnit.WEEKS.between(releaseMovieDate, endMovieShowDate))*2+1;
        Duration totalDuration = Duration.ofMinutes(numOfMovieShows * movieRunTime);

        System.out.println("StarWars IV was released on : " + releaseMovieDate.getDayOfWeek());
        System.out.println("StarWars IV has been shown " + numOfMovieShows + " times during " + period.getYears() + " years");
        System.out.println("Total duration of showing : " + formatDuration(totalDuration));
    }
}