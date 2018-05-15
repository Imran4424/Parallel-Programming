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

            Calculator add_obj = (Calculator) Naming.lookup(add_url);

            String sub_url = "rmi://localhost/SubstractionService";

            Calculator sub_obj = (Calculator) Naming.lookup(sub_url);

            String mul_url = "rmi://localhost/MultipicationService";

            Calculator mul_obj = (Calculator) Naming.lookup(mul_url);

            String div_url = "rmi://localhost/DivisionService";

            Calculator div_obj = (Calculator) Naming.lookup(div_url);
        }
    }
    
}