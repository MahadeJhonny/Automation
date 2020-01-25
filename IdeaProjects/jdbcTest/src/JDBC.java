import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";

        String user = "root";
        String password="Marjana123!";
        Connection connection=null;
        Statement statement=null;

       try {
           connection = DriverManager.getConnection(url,user,password);
            statement =connection.createStatement();

           String query= "insert into Product(Electronics,Grocery,Pharmacy)"+ " values (‘Battery’,'Soap’,'Tyrol’);";
           statement.execute(query);
           System.out.println("Movie added");

       }catch (SQLException ex) {
           ex.printStackTrace();
           System.out.println("Something Went Wrong");
       }




    }
}
