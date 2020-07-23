package jrout.tutorial.servlet.dao;

import jrout.tutorial.servlet.domain.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DVDSearchDaoImpl implements IDVDSearchDao {

    static {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver is loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> searchCustomerByFirstName(String firstName) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            System.out.println("Connection Established..");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement("select * from customer where first_name = ?");
            preparedStatement.setString(1,firstName);
            ResultSet resultSet = preparedStatement.executeQuery();

            Customer customer = null;
            while (resultSet.next()){
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setEmail(resultSet.getString("email"));
                customer.setStoreId(resultSet.getInt("store_id"));
                customerList.add(customer);

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
        return customerList;
    }

    @Override
    public Customer searchCustomerById(int customerId) {
        Customer customer = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            System.out.println("Connection Established..");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement("select * from customer where customer_id = ?");
            preparedStatement.setInt(1,customerId);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()){
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setEmail(resultSet.getString("email"));
                customer.setStoreId(resultSet.getInt("store_id"));
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

        return customer;
    }
}
