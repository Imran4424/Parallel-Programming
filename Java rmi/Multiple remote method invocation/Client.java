import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Client
 */
public class Client 
{
    /**
     * This client has no remote method
     * 
     * He uses classes like AdditionServer, SubstractionServer, MultipicationServer, DivisonServer 
    */




    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);

        int y = Integer.parseInt(args[1]);

        try 
        {
            String add_url = "rmi://localhost/AdditionService";
    
            Calculator add_obj = (Calculator) Naming.lookup(add_url);
    
            String sub_url = "rmi://localhost/SubstractionService";
    
            Calculator sub_obj = (Calculator) Naming.lookup(sub_url);
    
            String mul_url = "rmi://localhost/MultipicationService";
    
            Calculator mul_obj = (Calculator) Naming.lookup(mul_url);
    
            String div_url = "rmi://localhost/DivisionService";
    
            Calculator div_obj = (Calculator) Naming.lookup(div_url);
    
            System.out.println("The addition of " + x + " and " + y + " is: " + add_obj.sum(x, y));
    
            System.out.println("The substraction of " + x + " and " + y + " is: " + sub_obj.sum(x, y));
            
            System.out.println("The multipication of " + x + " and " + y + " is: " + mul_obj.sum(x, y));
            
            System.out.println("The division of " + x + " and " + y + " is: " + div_obj.sum(x, y));
            
        } 
        catch (MalformedURLException malurl) 
        {
            System.out.println();
            System.out.println("Malformed URL Exception");
            System.out.println();
        }
        catch(RemoteException re)
        {
            System.out.println();
            System.out.println("Remote Exception");
            System.out.println();
        }
        catch(NotBoundException notbe)
        {
            System.out.println();
            System.out.println("Not Bound Exception");
            System.out.println();
        }
        catch(ArithmeticException arie)
        {
            System.out.println();
            System.out.println("Arithmetic Exception");
            System.out.println();
        }
    }
    
}