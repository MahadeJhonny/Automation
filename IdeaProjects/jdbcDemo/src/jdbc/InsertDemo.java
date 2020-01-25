package jdbc;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) {

        String url = "mysql://localhost:3306/movies?serverTimezone=UTC";

        String user = "root";
        String password = "Marjana123!";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement=connection.createStatement();

            Movie movie=new Movie(10,"Man in Black",2019,"Action","PG13");
            String Query="Insert into movie (id title,release_year,genre,mpaa_rating) values(12,2010,'romance'.'R)";



        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
