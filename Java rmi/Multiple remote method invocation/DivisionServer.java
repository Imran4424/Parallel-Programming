import java.rmi.Naming;

/**
 * DivisionServer
 */
public class DivisionServer 
{
    public DivisionServer()
    {
        try 
        {
            Calculator obj = new Division();

            String url = "rmi://localhost:1099/DivisionServer";

            Naming.rebind(url, obj);  
        } 
        catch (Exception e) 
        {
            //TODO: handle exception

            System.out.println("Problem " + e);
        }
    }

    public static void main(String[] args) 
    {
        new DivisionServer();    
    }
    
}