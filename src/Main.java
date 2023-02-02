import cinema.week2.*;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Movie Name","Movie Genre");
        Movie movie2 = new Movie("Movie Name 2","Movie Genre");

        movie.setMovieName("New Movie Name");

        System.out.println(movie.getMovieName());
        System.out.println(movie2.getMovieName());
    }
}