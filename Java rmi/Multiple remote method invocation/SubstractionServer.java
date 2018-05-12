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
            Calculator obj = new Substraction();
            
            String url = "rmi://localhost:1099/SubstractionService";

            Naming.rebind(url, obj); 
        } 
        catch (Exception e) 
        {
            //TODO: handle exception

            System.out.println("Trouble " + e);
        }
    }

    public static void main(String[] args) 
    {
        new SubstractionServer();
    }
    
}