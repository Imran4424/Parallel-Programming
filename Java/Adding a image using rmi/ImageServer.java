import java.rmi.Naming;

/**
 * ImageServer
 */
public class ImageServer 
{
    public ImageServer()
    {
        
        try 
        {
            
            ImageProcessor obj = new ImplementingImageProcessor();
    
            String url = "rmi://localhost:1099/ImageService";

            Naming.rebind(url, obj);

        } catch (Exception e) {
            //TODO: handle exception

            System.out.println("Trouble " + e);
        }
    }
    
}