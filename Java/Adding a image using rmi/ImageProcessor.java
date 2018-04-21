import java.awt.Image;
import java.awt.image.BufferedImage;
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


    public BufferedImage setwaterMarkOne(BufferedImage img) throws RemoteException;

    public BufferedImage setwaterMarkTwo(BufferedImage img) throws RemoteException;

    public BufferedImage setwaterMarkOne(BufferedImage img) throws RemoteException;
    
}