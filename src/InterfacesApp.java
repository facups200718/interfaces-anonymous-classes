import impl.CarsSeries;
import impl.EnglishMovie;
import interfaces.AnimatedMovie;
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

        System.out.println();
        Movie cars = new CarsSeries("Cars", "John Lasseter", 9.1f, "Owen Wilson");
        AnimatedMovie cars2 = new CarsSeries("Cars 2", "John Lasseter", 7.8f, "Owen Wilson");
        System.out.println(cars.toString());
        System.out.println(cars2.toString());
        System.out.println("(cars instanceof CarsSeries) = " + (cars instanceof CarsSeries));
        System.out.println("(cars instanceof AnimatedMovie) = " + (cars instanceof AnimatedMovie));
        System.out.println("(cars instanceof Movie) = " + (cars instanceof Movie));
    }
}
