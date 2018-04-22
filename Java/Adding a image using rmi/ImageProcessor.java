import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;

import java.io.Serializable;

 /**
 * ImageProcessor
 */

public interface ImageProcessor extends Remote
{
    /**
     * Declaring the method prototype
     */


    public ImageIcon setWaterMarkOne(ImageIcon img) throws RemoteException, IOException;

    public int sum(int x,int y) throws RemoteException;

    public BufferedImage setWaterMarkTwo(BufferedImage img) throws RemoteException;

    public BufferedImage setWaterMarkThree(BufferedImage img) throws RemoteException;
    
}