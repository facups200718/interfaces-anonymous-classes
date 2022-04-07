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
        return this.name;
    }

    @Override
    public String getDirector() { return this.director; }

    @Override
    public Float getRating() {
        return this.rating;
    }
}
