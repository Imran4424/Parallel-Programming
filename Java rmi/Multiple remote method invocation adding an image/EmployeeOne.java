


/**
 * EmployeeOne
 */
public class EmployeeOne 
{
    public EmployeeOne()
    {
        try 
        {
            ImageProcessor obj = new ImplementingImageProcessor();
            
            String url = "rmi://localhost:1099/EmployeeOneService";
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}