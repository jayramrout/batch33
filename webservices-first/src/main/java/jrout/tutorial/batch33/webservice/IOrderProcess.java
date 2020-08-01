package jrout.tutorial.batch33.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface IOrderProcess {
    @WebMethod
    String processOrder(Order order);
}
