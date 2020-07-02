package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) throws Exception{
        ICalculator calculator = new CalculatorImpl();
        // tcp , http , smpt , ftp , https
        Registry registry = LocateRegistry.createRegistry(8888);
        registry.rebind("calc",calculator);
        System.out.println("Your calculator is now available...");
    }
}
