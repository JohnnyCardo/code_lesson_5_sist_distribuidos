package interfaceserviçoremoto;

import java.rmi.Naming; 

public class interfaceServer {
    
    interfaceServer()
    {
        try{
            serviceTest st = new serviceInterface(); 
            Naming.rebind("rmi://localhost:8080/CalculatorService", st); 
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("\n\nCaiu no catch!");
        }
    }
      public static void main(String[] args) {
          
        new interfaceServer();
    }
}
