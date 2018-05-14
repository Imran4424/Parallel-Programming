import java.rmi.Naming;
import java.util.Calendar;

/**
 * Client
 */
public class Client 
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);
        
        int y = Integer.parseInt(args[1]);

        try 
        {
            
        } 
        catch (Exception e) 
        {
            String add_url = "rmi://localhost/AdditionService";

            Calculator obj = (Calculator) Naming.lookup(add_url);
        }
    }
    
}