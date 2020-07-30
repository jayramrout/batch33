package jrout.tutorial.spring.service;

import jrout.tutorial.spring.domain.Customer;

import java.util.List;

public interface IDVDService {
    String queryCustomerByName(String fname);
    String queryForCustomerFirstName(int custId);
    List<Customer> queryWithFirstName(String firstName);
}
