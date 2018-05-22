import java.rmi.Naming;

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
        new EmployeeThree();    
    }
}