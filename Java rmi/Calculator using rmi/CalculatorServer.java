import java.rmi.Naming;

/**
 * CalculatorServer
 */
public class CalculatorServer 
{
    public CalculatorServer()
    {
        try 
        {
            Calculator obj = new ImplementingCalculator();

            String url = "rmi://localhost:1099/CalculatorService";

            Naming.rebind(url, obj);
            
        } catch (Exception e) {
            //TODO: handle exception

            System.out.println("Trouble " + e);
        }
    }

    public static void main(String[] args) 
    {
        new CalculatorServer();
    }
    
}