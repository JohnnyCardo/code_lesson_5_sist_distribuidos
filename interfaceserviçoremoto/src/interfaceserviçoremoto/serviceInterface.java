package interfaceserviçoremoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class serviceInterface extends UnicastRemoteObject implements serviceTest 
{ 
    protected serviceInterface() throws RemoteException  
    { super(); } 
    
    public long multiplicator(long var1, long var2) throws RemoteException  
    { 
        System.out.println("\nRealizando a multiplicação!");
        return var1 * var2;
    } 
}
