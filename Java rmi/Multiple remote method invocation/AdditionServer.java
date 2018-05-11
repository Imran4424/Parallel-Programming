import java.rmi.Naming;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * AdditionServer
 */
public class AdditionServer 
{
    public CalculatorServer()
    {
        try 
        {
            Calcutalor obj = new Addition();

            String url = "rmi://localhost:1099/AdditionService";

            Naming.rebind(url, obj);
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
    
}