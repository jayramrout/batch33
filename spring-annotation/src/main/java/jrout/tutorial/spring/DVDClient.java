package jrout.tutorial.spring;

import jrout.tutorial.spring.domain.Customer;
import jrout.tutorial.spring.service.DVDServiceImpl;
import jrout.tutorial.spring.service.IDVDService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
// DVDClient is dependent on DVDServiceImpl

public class DVDClient {
    public static void main(String[] args) {
        String contextFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(contextFile);
        IDVDService idvdService = context.getBean("dvdServiceImpl", IDVDService.class);
//        String name = idvdService.queryCustomerByName("sam");
//        System.out.println("Full Name ="+ name);

        String firstName = idvdService.queryForCustomerFirstName(3);
        System.out.println(firstName);

        List<Customer> kelly = idvdService.queryWithFirstName("Kelly");
    }
}
