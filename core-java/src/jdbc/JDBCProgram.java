package jdbc;

import java.sql.*;
public class JDBCProgram {
    public static void main(String[] args) {
        int actor_id = 199; // args[0]..
        // load the drivers...
        /*Driver postgreDriver = new org.postgresql.Driver();
        try {
            DriverManager.registerDriver(postgreDriver);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver is loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // Get the connection...
        Connection connection = null;
        try {
            // jdbc:oracle:thin:@localhost:1521/XE
            // what is the url to connect to mysql
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            System.out.println("Connection Established..");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from actor where actor_id = 199");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("actor_id")
                        +" "+ resultSet.getString("first_name") +
                        " "+ resultSet.getString("last_name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
