import impl.CarsSeries;
import impl.EnglishMovie;
import impl.HarryPotterSeries;
import interfaces.AnimatedMovie;
import interfaces.Book;
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
        System.out.println(cars);
        System.out.println(cars2);
        System.out.println("(cars instanceof CarsSeries) = " + (cars instanceof CarsSeries));
        System.out.println("(cars instanceof AnimatedMovie) = " + (cars instanceof AnimatedMovie));
        System.out.println("(cars instanceof Movie) = " + (cars instanceof Movie));

        System.out.println();
        Book harryPotter1 = new HarryPotterSeries("The Sorcerer's Stone", "JK Rowling", "Scholastic",
                "The Sorcerer's Stone", "Chris Columbus", 9.5f, "2001");
        Movie harryPotter2 = new HarryPotterSeries("The Chamber of Secrets", "JK Rowling", "Scholastic",
                "The Chamber of Secrets", "Chris Columbus", 8.6f, "2002");
        System.out.println("harryPotter1 = " + harryPotter1);
        System.out.println("harryPotter2 = " + harryPotter2);
        System.out.println("(harryPotter1 instanceof HarryPotterSeries) = " + (harryPotter1 instanceof HarryPotterSeries));
        System.out.println("(harryPotter1 instanceof Book) = " + (harryPotter1 instanceof Book));
        System.out.println("(harryPotter1 instanceof Movie) = " + (harryPotter1 instanceof Movie));
        System.out.println("((Movie) harryPotter1).getReleaseDate() = " + ((Movie) harryPotter1).getReleaseDate());
        System.out.println("((HarryPotterSeries) harryPotter2).getReleaseDate() = " + ((HarryPotterSeries) harryPotter2).getReleaseDate());
    }
}
