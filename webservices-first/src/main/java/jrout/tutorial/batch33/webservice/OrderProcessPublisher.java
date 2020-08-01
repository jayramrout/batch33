package jrout.tutorial.batch33.webservice;

import javax.xml.ws.Endpoint;

public class OrderProcessPublisher {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9999/ws/orderProcess",new OrderProcessImpl());
        System.out.println("Order Process Service is up and running....");
    // http://localhost:9999/ws/orderProcess?wsdl
    }
}
