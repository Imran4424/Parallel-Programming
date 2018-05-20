import net.coobird.thumbnailator.filters.*;
import net.coobird.thumbnailator.geometry.*;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import javax.swing.text.Position;
//import java.io.NotSerializableException;
//import java.io.Serializable;




/**
 * ImplementingImageProcessor
 */


public class ImplementingImageProcessor extends UnicastRemoteObject implements ImageProcessor
{
    /**
     * Implementations must have a explicit constructor
     * in order to throw RemoteException exception
     */

    public ImplementingImageProcessor() throws RemoteException
    {
        super();

        /**
        * super keyword use to called parent constructor
        * super can be used to do more specific work like
        * 
        * super(arguments) to called parent constructor who accepts arguments
        *
        * super can also use to called parent class method that is  - super.aMethod()
        *
        * and we all know that what constructor is, constructure initialize the object values with given values
        *
        * for default constructors, the object values will be initialized with default values
        */
    }

    public ImageIcon setWaterMark(ImageIcon img) throws RemoteException , IOException
    {
        BufferedImage originalImage = new BufferedImage(img.getIconWidth(), img.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = originalImage.createGraphics();
        // paint the Icon to the BufferedImage.
        img.paintIcon(null, g, 0, 0);
        g.dispose();

        BufferedImage watermark = ImageIO.read(this.getClass().getResource("imran.jpg"));

        Watermark filter = new Watermark(Positions.CENTER, watermark, 0.5f);
        BufferedImage watermarkedImage = filter.apply(originalImage);


        return (new ImageIcon(watermarkedImage));
    }

    
}