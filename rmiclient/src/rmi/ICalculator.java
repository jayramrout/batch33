package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
    int calcTax(Integer a , Integer b) throws RemoteException;
}
