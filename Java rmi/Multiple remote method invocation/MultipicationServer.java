import java.rmi.Naming;

/**
 * MultipicationServer
 */
 public class MultipicationServer 
{
    public MultipicationServer()
    {
        Calcutalor obj = new Multipication();

        String url = "rmi://localhost:1099/MultipicationService";

        Naming.rebind(url, obj);

        try {
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}