package interfaceserviçoremoto;

import java.rmi.Remote; 
import java.rmi.RemoteException; 
   
public interface serviceTest extends Remote 
{ 
    public long multiplicator(long var1, long var2) throws RemoteException; 
}