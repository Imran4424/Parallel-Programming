import java.awt.Image;
import java.rmi.Remote;
import java.rmi.RemoteException;

 /**
 * ImageProcessor
 */

public interface ImageProcessor extends Remote
{
    /**
     * Declaring the method prototype
     */


    public BufferedImage setwaterMark(Image sourceFile) throws RemoteException;
    
}