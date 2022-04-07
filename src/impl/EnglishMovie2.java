package impl;

import abstractClasses.UnreleasedMovie;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EnglishMovie2 extends UnreleasedMovie {
    private Float rating;
    private String releaseDate;

    public EnglishMovie2(String name, String director, Float rating, String releaseDate) {
        super(name, director);
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    @Override
    public Float getRating() {
        return this.rating;
    }

    @Override
    public String getReleaseDate() {
        return this.releaseDate;
    }

    @Override
    public String toString() {
        return "EnglishMovie2{" + "name=" + this.getName() + ", director=" + this.getDirector() +
                ", rating=" + rating +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
