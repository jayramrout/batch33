package jrout.tutorial.spring.dao;

import jrout.tutorial.spring.domain.Customer;

import java.util.List;

public interface IDVDDao {
    String queryCustomerByName(String fname);
    String queryForCustomerFirstName(int custId);
    List<Customer> queryWithFirstName(String firstName);
}
