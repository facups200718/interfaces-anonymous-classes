import interfaces.Book;
import interfaces.Movie;

public class AnonymousApp {
    public static void main(String[] args) {
        //La clase que implementa la interfaz Movie acá es anónima debido a que no tiene nombre
        //Te ahorras tener que crear un archivo más, la app es más liviana en consecuencia
        Movie cars2 = new Movie() {
            @Override
            public String getName() {
                return "Cars 2";
            }

            @Override
            public String getDirector() {
                return "John Lasseter";
            }

            @Override
            public Float getRating() {
                return 7.3f;
            }

            @Override
            public String getReleaseDate() {
                return "2011";
            }

            @Override
            public String toString() {
                return String.format("Name: %s, Director: %s, Rating: %s, Release date: %s",
                        getName(), getDirector(), getRating(), getReleaseDate());
            }
        };

        Movie cars3 = new Movie() {
            @Override
            public String getName() {
                return "Cars 3";
            }

            @Override
            public String getDirector() {
                return "Brian Fee";
            }

            @Override
            public Float getRating() {
                return 8.1f;
            }

            @Override
            public String toString() {
                return String.format("Name: %s, Director: %s, Rating: %s",
                        getName(), getDirector(), getRating());
            }
        };
        //Te tira el nombre de la clase donde se crearon (AnonymousApp en este caso)
        System.out.println("cars2.getClass() = " + cars2.getClass());
        System.out.println("cars3.getClass() = " + cars3.getClass());

        displayMovie(cars2);
        displayMovie(cars3);

        Book harryPotter3 = new Book() {
            @Override
            public String getTitle() {
                return "The Prisoner of Azkaban";
            }

            @Override
            public String getAuthor() {
                return "JK Rowling";
            }

            @Override
            public String getPublisher() {
                return "Scholastic";
            }

            @Override
            public String toString() {
                return String.format("Title: %s, Author: %s, Publisher: %s",
                        getTitle(), getAuthor(), getPublisher());
            }
        };
    }
    
    private static void displayMovie(Movie movie) {
        System.out.println("-------------------------------------------------------");
        System.out.println("movie = " + movie);
        System.out.println("-------------------------------------------------------");
    }
}
