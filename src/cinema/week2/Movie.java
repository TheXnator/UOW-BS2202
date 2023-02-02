package cinema.week2;

public class Movie {
    private String movieName;
    private String genre;

    public Movie(String movieName, String genre) {
        this.movieName = movieName;
        this.genre = genre;
    }

    public void PlayMovie() {
        System.out.println("Movie has started");
    }

    // Getters and setters
    public String getMovieName() {
        return (movieName != null) ? movieName : "Unknown Name";
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return (genre != null) ? genre : "Unknown Genre";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
