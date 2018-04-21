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


    public BufferedImage setWaterMarkOne(BufferedImage img) throws RemoteException;

    public BufferedImage setWaterMarkTwo(BufferedImage img) throws RemoteException;

    public BufferedImage setWaterMarkThree(BufferedImage img) throws RemoteException;
    
}