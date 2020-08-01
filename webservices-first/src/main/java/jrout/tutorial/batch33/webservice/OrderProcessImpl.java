package jrout.tutorial.batch33.webservice;

import javax.jws.WebService;

@WebService(serviceName = "OrderProcessService",
        portName = "OrderProcessPort",
        endpointInterface = "jrout.tutorial.batch33.webservice.IOrderProcess")
public class OrderProcessImpl implements IOrderProcess{

    @Override
    public String processOrder(Order order) {
        return "Order is procesed "+ order.getItemId();
    }
}
