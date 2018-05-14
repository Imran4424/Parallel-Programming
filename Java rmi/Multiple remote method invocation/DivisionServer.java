



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
            
        } 
        catch (Exception e) 
        {
            //TODO: handle exception

            System.out.println("Problem " + e);
        }
    }
    
}