



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

            
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
    
}