package jrout.tutorial.spring.service;

import jrout.tutorial.spring.dao.DVDDaoImpl;
import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.domain.Customer;

import java.util.List;

public class DVDService_NewImpl implements IDVDService{
    public String queryCustomerByName(String fname) {
        IDVDDao dao = new DVDDaoImpl();
        return dao.queryCustomerByName(fname) +" New";
    }

    @Override
    public String queryForCustomerFirstName(int custId) {
        return null;
    }

    @Override
    public List<Customer> queryWithFirstName(String firstName) {
        return null;
    }
}
