import java.rmi.Naming;

/**
 * SubstractionServer
 */
public class SubstractionServer 
{
    public SubstractionServer()
    {
        try 
        {
            Calcutalor obj = new Substraction();
            
            String url = "rmi://localhost:1099/SubstractionService";

            Naming.rebind(url, obj); 
        } 
        catch (Exception e) 
        {
            //TODO: handle exception

            System.out.println("Trouble " + e);
        }
    }
    
}