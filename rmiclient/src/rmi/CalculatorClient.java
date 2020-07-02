package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",7777);
            ICalculator calc = (ICalculator)registry.lookup("calc");
            int i = calc.calcTax(100, 5);
            System.out.println(i);

        // what are the different protocols present...and wht is the range of tcp , http...
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
