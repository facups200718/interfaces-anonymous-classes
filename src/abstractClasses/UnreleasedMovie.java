package abstractClasses;

import interfaces.Movie;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class UnreleasedMovie implements Movie {
    private String name;
    private String director;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDirector() {
        return this.director;
    }

    public abstract Float getRating();
    public abstract String getReleaseDate();
}
