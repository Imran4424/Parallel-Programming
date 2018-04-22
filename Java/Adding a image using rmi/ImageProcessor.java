import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.Serializable;

 /**
 * ImageProcessor
 */

public interface ImageProcessor extends Remote
{
    /**
     * Declaring the method prototype
     */


    public Image setWaterMarkOne(Image img) throws RemoteException;

    public int sum(int x,int y) throws RemoteException;

    public BufferedImage setWaterMarkTwo(BufferedImage img) throws RemoteException;

    public BufferedImage setWaterMarkThree(BufferedImage img) throws RemoteException;
    
}