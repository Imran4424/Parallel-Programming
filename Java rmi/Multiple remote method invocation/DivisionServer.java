



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
            
        } 
        catch (Exception e) 
        {
            //TODO: handle exception

            System.out.println("Problem " + e);
        }
    }
    
}