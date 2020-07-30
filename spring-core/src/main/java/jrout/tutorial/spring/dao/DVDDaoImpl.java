package jrout.tutorial.spring.dao;

import java.util.HashMap;
import java.util.Map;

public class DVDDaoImpl implements IDVDDao {
    private Map<String,String> nameMap = new HashMap();
    public DVDDaoImpl(){
        nameMap.put("peter","Peter Pan");
        nameMap.put("sam","Sam Hasan");
        nameMap.put("dan","Dan ban");
    }
    public String queryCustomerByName(String fname) {
        String fullname = nameMap.get(fname);
        return fullname;
    }
}
