package jrout.tutorial.batch33.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class OrderProcesClient {
    public static void main(String[] args) {
        // http://localhost:9999/ws/orderProcess?wsdl

        try {
            URL url = new URL("http://localhost:9999/ws/orderProcess?wsdl");
            QName qName = new QName("http://webservice.batch33.tutorial.jrout/","OrderProcessService");
            Service service = Service.create(url, qName);
            IOrderProcess process = service.getPort(IOrderProcess.class);

            Order order = new Order();
            order.setItemId("33333");
            String s = process.processOrder(order);
            System.out.println(s);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
