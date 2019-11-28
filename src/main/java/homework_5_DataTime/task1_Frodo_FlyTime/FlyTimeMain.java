package homework_5_DataTime.task1_Frodo_FlyTime;

import java.time.*;
import static homework_5_DataTime.TimeFormat.*;

public class FlyTimeMain {
    public static void main(String[] args) {
        ZonedDateTime departureZoneDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.of(11, 15), ZoneId.of("Australia/Sydney"));
        ZonedDateTime arrivalZoneDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.of(06, 00), ZoneId.of("America/Los_Angeles"));
        Duration duration = Duration.between(departureZoneDateTime, arrivalZoneDateTime);
        System.out.println("Frodo flew : " + formatDuration(duration));
    }
}
