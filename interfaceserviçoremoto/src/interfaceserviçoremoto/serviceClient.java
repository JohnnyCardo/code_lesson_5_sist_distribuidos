package interfaceserviçoremoto;

import java.rmi.Naming; 

public class serviceClient {
    public static void main(String[] args)  
    { 
        try
        { 
            serviceTest st = (serviceTest) Naming.lookup("//localhost:8080/CalculatorService"); 
            System.out.println("Multiplicação realizada : "+st.multiplicator(50, 10)); 
        }  
        catch (Exception e)  
        { 
            System.out.println("\n\nCaiu no catch! Não foi feito o calculo."); 
        } 
    } 
}