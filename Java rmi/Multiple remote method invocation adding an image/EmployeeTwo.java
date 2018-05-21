import java.rmi.Naming;

/**
 * EmployeeTwo
 */
public class EmployeeTwo 
{
    public EmployeeTwo()
    {
        try 
        {
            ImageProcessor obj = new ImplementingImageProcessor();
            
            String url = "rmi://localhost:1099/EmployeeTwoService";

            Naming.rebind(url, obj);
        } 
        catch (Exception e) 
        {
            //TODO: handle exception

            
        }
    }
    
}
