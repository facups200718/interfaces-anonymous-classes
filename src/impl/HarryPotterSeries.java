package impl;

import interfaces.Book;
import interfaces.Movie;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HarryPotterSeries implements Book, Movie {
    private String title;
    private String author;
    private String publisher;
    private String name;
    private String director;
    private Float rating;
    private String releaseDate;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getPublisher() {
        return this.publisher;
    }

    @Override
    public String toString() {
        return "HarryPotterSeries{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDirector() {
        return this.director;
    }

    @Override
    public Float getRating() {
        return this.rating;
    }

    @Override
    public String getReleaseDate() {
        return this.releaseDate;
    }
}
