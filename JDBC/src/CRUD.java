import java.io.*;
import java.sql.*;

public class CRUD {

    public static void main(String[] args) throws SQLException {
        PassCode ps = new PassCode();
        String password = ps.getPassword();
        String url
                = "jdbc:mysql://localhost:3306/test";
        String username = "root";

        Connection con = null;

        try {
            con = DriverManager.getConnection(
                    url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(
                "Connection Established successfully");

        Statement  cursor = con.createStatement();

        //create table

        /*String query
                = "create table data (Id int(20) primary key auto_increment ,name varchar(20),city varchar(20));";
        System.out.println(cursor.executeUpdate(query));*/

        //insert data
        /*String query
                = //"insert into data(name,city) values(\"Ram\",\"Indore\");";
                "insert into data(name,city) values(\"Sandeep\",\"Indore\"),(\"Sham\",\"Indore\"),(\"Mohan\",\"Bhopal\"),(\"Ram\",\"Dewas\");";
        System.out.println(cursor.executeUpdate(query));*/

        //read data
        String query
                = "select * from data;";

        ResultSet res = cursor.executeQuery(query);

        while (res.next())
            System.out.println(res.getString("Id")+ " " +res.getString("name")+ " " +res.getString("city"));





        cursor.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");

    }
}
