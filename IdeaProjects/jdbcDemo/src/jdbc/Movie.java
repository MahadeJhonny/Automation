package jdbc;

public class Movie {
    private int id;
    private String title;
    private int release_year;
    private String genere;
    private String mpaa_rating;

    public Movie(int id, String title, int release_year, String genere, String mpaa_rating) {
        this.id = id;
        this.title = title;
        this.release_year = release_year;
        this.genere = genere;
        this.mpaa_rating = mpaa_rating;
    }
}
