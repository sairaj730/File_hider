package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/file_hider?allowPublicKeyRetrieval=true&useSSL=false","root","Vadasairaju123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("connection established");
        return connection;
    }

    public static void closeConnection() {
        if(connection != null){
            try {
                connection.close();
            }catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        MyConnection.getConnection();
    }
}
