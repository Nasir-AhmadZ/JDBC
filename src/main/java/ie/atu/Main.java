package ie.atu;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            //Load the driver class
            Class.forName("com.mysql.cj.jbdc.Driver");
            //Create a connection to the database, hardcoding values for now
            connection = DriverManager.getConnection("jbdc:mysql://localhost3306/jdbc", "root", "password");
            System.out.println("Connection made to connection pool");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //close the connection when finished
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}