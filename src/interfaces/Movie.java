package interfaces;

import java.util.Calendar;

import static java.util.Calendar.*;

public interface Movie {
    String MOVIE_SITE = "Fabulous Movies";
    String getName();
    String getDirector();
    Float getRating();
    static String getFormattedCalendarString() {
        Calendar now = Calendar.getInstance();
        return String.format("%s-%s-%s", now.get(MONTH), now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.YEAR));
    }
    default String getReleaseDate() {
        return getFormattedCalendarString();
    }
}
