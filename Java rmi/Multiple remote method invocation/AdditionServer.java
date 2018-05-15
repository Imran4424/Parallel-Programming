import java.rmi.Naming;


/**
 * AdditionServer
 */
public class AdditionServer 
{
    public AdditionServer()
    {
        try 
        {
            Calculator obj = new Addition();

            String url = "rmi://localhost:1099/AdditionService";

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
        new AdditionServer();
    }
}