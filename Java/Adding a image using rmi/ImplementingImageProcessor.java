import net.coobird.thumbnailator.filters.*;
import net.coobird.thumbnailator.geometry.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParsePosition;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.text.Position;
import java.io.NotSerializableException;
import java.io.Serializable;




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

    public ImageIcon setWaterMarkOne(ImageIcon img) throws RemoteException , IOException
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

    public int sum(int x,int y) throws RemoteException
    {
        return x+y;
    }

    public BufferedImage setWaterMarkTwo(BufferedImage img) throws RemoteException 
    {
        //setting up the watermark properties

        String watermark = "Second";
        Font font = new Font("Monospaced", Font.PLAIN, 14);
        Color c = Color.BLACK;
        Positions pos = Positions.CENTER;
        int insetPixels = 0;

        //Applying watermark

        Caption filter = new Caption(watermark, font, c, pos, insetPixels);

        BufferedImage watermark_image = filter.apply(img);

        return watermark_image;
    }
    
    public BufferedImage setWaterMarkThree(BufferedImage img) throws RemoteException 
    {
        //setting up the watermark properties

        String watermark = "Third";
        Font font = new Font("Monospaced", Font.PLAIN, 14);
        Color c = Color.BLACK;
        Positions pos = Positions.CENTER;
        int insetPixels = 0;

        //Applying watermark

        Caption filter = new Caption(watermark, font, c, pos, insetPixels);

        BufferedImage watermark_image = filter.apply(img);

        return watermark_image;
    }
}