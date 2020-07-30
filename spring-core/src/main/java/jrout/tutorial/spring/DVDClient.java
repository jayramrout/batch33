package jrout.tutorial.spring;

import jrout.tutorial.spring.service.DVDServiceImpl;
import jrout.tutorial.spring.service.IDVDService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// DVDClient is dependent on DVDServiceImpl

public class DVDClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IDVDService idvdService = context.getBean("dvdServiceImpl", IDVDService.class);
        String name = idvdService.queryCustomerByName("sam");
        System.out.println("Full Name ="+ name);
    }
}
