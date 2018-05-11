import java.rmi.Naming;

/**
 * MultipicationServer
 */
 public class MultipicationServer 
{
    public MultipicationServer()
    {
        
        try 
        {
            Calcutalor obj = new Multipication();
    
            String url = "rmi://localhost:1099/MultipicationService";
    
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
        new MultipicationServer();    
    }
    
}