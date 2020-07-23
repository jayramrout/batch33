package jrout.tutorial.servlet.service;

import jrout.tutorial.servlet.dao.DVDSearchDaoImpl;
import jrout.tutorial.servlet.dao.IDVDSearchDao;
import jrout.tutorial.servlet.domain.Customer;

import java.util.List;

public class DVDServiceImpl implements IDVDService{

    @Override
    public List<Customer> searchCustomerByFirstName(String firstName) {
        IDVDSearchDao dao = new DVDSearchDaoImpl();
        List<Customer> customers = dao.searchCustomerByFirstName(firstName);
        //if today is 2nd sunday on March...
        // customer.setGift();
        return customers;
    }

    @Override
    public Customer searchCustomerById(int customerId) {
        IDVDSearchDao dao = new DVDSearchDaoImpl();
        Customer customer = dao.searchCustomerById(customerId);
        //if today is 2nd sunday on March...
        // customer.setGift();
        customer.setGift("a Pen");

        return customer;
    }
}
