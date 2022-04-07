import impl.EnglishMovie;
import interfaces.Movie;

public class InterfacesApp {
    public static void main(String[] args) {
        EnglishMovie englishMovie = new EnglishMovie("Titanic", "James Cameron", 8f);
        System.out.println("englishMovie.getDirector() = " + englishMovie.getDirector());
        System.out.println("englishMovie.getName() = " + englishMovie.getName());
        System.out.println("englishMovie.getRating() = " + englishMovie.getRating());

        System.out.println();
        System.out.println("englishMovie instanceof interfaces.Movie = " + (englishMovie instanceof Movie));
        System.out.println("englishMovie instanceof impl.EnglishMovie = " + (englishMovie instanceof EnglishMovie));

        System.out.println();
        System.out.println("impl.EnglishMovie.movieSite = " + EnglishMovie.MOVIE_SITE);
        System.out.println("interfaces.Movie.movieSite = " + Movie.MOVIE_SITE);
    }
}
