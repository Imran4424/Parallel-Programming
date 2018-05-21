import java.rmi.Naming;

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
        new EmployeeOne();    
    }
    
}