package homework_5_DataTime;

import java.time.Duration;

public abstract class TimeFormat {
    public static String formatDuration(Duration duration) {
        long hours = Math.abs(duration.toHours());
        long minutes = Math.abs(duration.minusHours(hours).toMinutes());
        return String.format("%d hours %02d minutes", hours, minutes);
    }
}
