import java.rmi.Naming;

/**
 * CalculatorClient
 */

public class CalculatorClient 
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);

        int y = Integer.parseInt(args[1]);

        try 
        {
            String

            Calculator obj = (Calculator) Naming.lookup(name)    
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}