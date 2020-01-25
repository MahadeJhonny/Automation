package newPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";
        String user = "root";
        String password = "Marjana123!";

        Connection connection = null;
        Statement statement = null;

        try {

            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            Product product = new Movie(10, "Men In Black", 2000, "SciFi", "PG-13");
            String query = "insert into movie (id, title, release_year, genre, mpaa_rating)" +
                    " values (" + mib.getId() + ", '" + mib.getTitle() + "', " + mib.getReleaseYear() +
                    ", '" + mib.getGenre() + "', '" + mib.getMpaaRating() + "');";
            statement.execute(query);


}
