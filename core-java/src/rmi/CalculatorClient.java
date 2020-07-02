package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        try {
           /* ICalculator calc = new CalculatorImpl();
            */

            Registry registry = LocateRegistry.getRegistry(7777);
            ICalculator calc = (ICalculator)registry.lookup("calc");
            int i = calc.calcTax(20, 5);
            System.out.println(i);

        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
