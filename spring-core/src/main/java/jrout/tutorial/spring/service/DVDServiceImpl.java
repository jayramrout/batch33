package jrout.tutorial.spring.service;

import jrout.tutorial.spring.dao.DVDDaoImpl;
import jrout.tutorial.spring.dao.IDVDDao;
// DVDServiceImpl is dependent on DVDDaoImpl

public class DVDServiceImpl implements IDVDService {
    private IDVDDao dao = null; // inject the dvddaoimpl into this class..

    public String queryCustomerByName(String fname) {
        return dao.queryCustomerByName(fname);
    }

    public void setDao(IDVDDao dao) {
        this.dao = dao;
    }
}
