import java.rmi.Naming;

/**
 * Server
 */
public class Server 
{
    public Server()
    {
        try 
        {
            Sort s_obj = new Sorting();
            
            String url ="rmi://localhost:1099/Sort";

            Naming.rebind(url, s_obj);

            Average a_obj = new AverageCal();

            String url2 = "rmi://localhost:1099/Average";

            Naming.rebind(url2, a_obj);

            Prime p_obj = new PrimeCal();

            String url3 = "rmi://localhost:1099/Prime";

            Naming.rebind(url3, p_obj);

        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public static void main(String[] args) {
        new Server();
    }
    
}