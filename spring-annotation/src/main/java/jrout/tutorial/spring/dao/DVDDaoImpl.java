package jrout.tutorial.spring.dao;

import jrout.tutorial.spring.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// new DVDDaoImpl();
@Component
public class DVDDaoImpl implements IDVDDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    NamedParameterJdbcTemplate nt;

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


    @Override
    public String queryForCustomerFirstName(int custId) {
        String query = "select * from customer where customer_id = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(query, new Object[]{custId});

        return (String)stringObjectMap.get("first_name");
    }

    /*@Override
    public String queryForCustomerFirstName(int custId) {
        String query = "select * from customer where customer_id = :cutomerId";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("cutomerId", new Integer(custId));
        Map<String, Object> stringObjectMap = nt.queryForMap(query, params);

        return (String)stringObjectMap.get("first_name");
    }*/

    // conver the list<map> to list<customer>
   // @Override
    /*public List<Customer> queryWithFirstName(String firstName) {
        String query = "select * from customer where first_name = ?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(query, new Object[]{firstName});

        System.out.println(maps);

        return null;
    }*/

    @Override
    public List<Customer> queryWithFirstName(String firstName) {
        String query = "select * from customer where first_name = ?";

        Customer customer = jdbcTemplate.queryForObject(query, new Object[]{firstName}, new RowMapper<Customer>() {

            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                Customer customer = new Customer();
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setCustomerId(resultSet.getInt("customer_id"));
                return customer;
            }
        });
        return null;
    }
}
