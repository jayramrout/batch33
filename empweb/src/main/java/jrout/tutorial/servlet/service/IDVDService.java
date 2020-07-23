package jrout.tutorial.servlet.service;

import jrout.tutorial.servlet.domain.Customer;

import java.util.List;

public interface IDVDService {
    List<Customer> searchCustomerByFirstName(String firstName);
    Customer searchCustomerById(int customerId);
}
