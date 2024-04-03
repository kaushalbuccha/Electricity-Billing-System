import java.sql.*;
// jdbc:mysql://localhost:3306/?user=root
public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system","root","root");
            statement = connection.createStatement();
            System.out.println("Connected");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // public static void main(String[] args) {
    //     new database();
    // }
}