package jrout.tutorial.spring.service;

import jrout.tutorial.spring.dao.DVDDaoImpl;
import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
// DVDServiceImpl is dependent on DVDDaoImpl

@Component("dvdServiceImpl")
public class DVDServiceImpl implements IDVDService {

    @Autowired
    private IDVDDao dao = null; // inject the dvddaoimpl into this class..
    public String queryCustomerByName(String fname) {
        return dao.queryCustomerByName(fname);
    }

    @Override
    public String queryForCustomerFirstName(int custId) {
        return dao.queryForCustomerFirstName(custId);
    }

    @Override
    public List<Customer> queryWithFirstName(String firstName) {
        return dao.queryWithFirstName(firstName);
    }

    public void setDao(IDVDDao dao) {
        this.dao = dao;
    }
}
