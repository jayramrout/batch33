package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements ICalculator{
    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int calcTax(Integer a, Integer b)throws RemoteException {
        int result = a/b + 20;
        return result;
    }
}
