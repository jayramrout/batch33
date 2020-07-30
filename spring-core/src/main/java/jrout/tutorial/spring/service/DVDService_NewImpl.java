package jrout.tutorial.spring.service;

import jrout.tutorial.spring.dao.DVDDaoImpl;
import jrout.tutorial.spring.dao.IDVDDao;

public class DVDService_NewImpl implements IDVDService{
    public String queryCustomerByName(String fname) {
        IDVDDao dao = new DVDDaoImpl();
        return dao.queryCustomerByName(fname) +" New";
    }
}
