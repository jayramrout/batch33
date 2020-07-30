package jrout.tutorial.spring;

import jrout.tutorial.spring.service.IDVDService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// DVDClient is dependent on DVDServiceImpl

public class DVDClient2 {
    public static void main(String[] args) {

        String contextFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(contextFile);
        IDVDService idvdService = context.getBean("dvdServiceImpl", IDVDService.class);
        String name = idvdService.queryCustomerByName("sam");
        System.out.println("Full Name ="+ name);
    }
}
