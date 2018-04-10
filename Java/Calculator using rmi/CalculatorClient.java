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
            String url = "rmi://localhost/CalculatorService";

            Calculator obj = (Calculator) Naming.lookup(url);
            
            System.out.println("The addition of " + x + " and " + y + " is: " + obj.add(x, y));

            System.out.println("The substraction of " + x + " and " + y + " is: " + obj.sub(x, y));

            
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}