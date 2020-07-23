package jrout.tutorial.servlet.dao;

import jrout.tutorial.servlet.domain.Customer;

import java.util.List;

public interface IDVDSearchDao {
    List<Customer> searchCustomerByFirstName(String firstName);
    Customer searchCustomerById(int customerId);
}
