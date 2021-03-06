package jdbc;

import java.sql.*;

public class JDBCProgramPreparedStement {
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
//        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {
            // FileReadre...
            preparedStatement = connection.prepareStatement("select * from actor where first_name = ? and last_name = ?");
            preparedStatement.setString(1,"Nick");
            preparedStatement.setString(2,"Stallone");
            ResultSet resultSet = preparedStatement.executeQuery();

//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from actor where actor_id = " + actor_id);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("actor_id")
                        +" "+ resultSet.getString("first_name") +
                        " "+ resultSet.getString("last_name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
