package impl;

import interfaces.AnimatedMovie;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarsSeries implements AnimatedMovie {
    private String name;
    private String director;
    private Float rating;
    private String voiceOverArtist;

    @Override
    public String getName() { return this.name; }

    @Override
    public String getDirector() { return this.director; }

    @Override
    public Float getRating() { return this.rating; }

    @Override
    public String toString() {
        return "CarsSeries{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public String getVoiceoverArtist() { return this.voiceOverArtist; }
}
