

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
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
    
}
