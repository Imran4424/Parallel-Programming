


/**
 * EmployeeThree
 */
public class EmployeeThree 
{
    public EmployeeThree()
    {
        try 
        {
            ImageProcessor obj = new ImplementingImageProcessor();
            
            String url = "rmi://localhost:1099/EmployeeThreeService";
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
    
}