package impl;

import interfaces.Movie;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class EnglishMovie implements Movie {
    private String name;
    private String director;
    private Float rating;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDirector() {
        return null;
    }

    @Override
    public Float getRating() {
        return 0f;
    }
}
