import net.coobird.thumbnailator.filters.*;
import net.coobird.thumbnailator.geometry.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParsePosition;

import javax.swing.text.Position;




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

    public BufferedImage setWaterMarkOne(BufferedImage img) throws RemoteException
    {
        //setting up the watermark properties

        String watermark = "First";
        Font font = new font("Monospaced",Font.PLAIN,14);
        Color c = Color.BLACK;
        Position pos = Positions.CENTER;
        int insetPixels = 0;

        //Applying watermark

        Caption filter = new Caption(watermark,font,c,pos,insetPixels);

        BufferedImage watermark_image = filter.apply(img);

        return watermark_image;
    }

    public BufferedImage setWaterMarkTwo(BufferedImage img) throws RemoteException {
        //setting up the watermark properties

        String watermark = "Second";
        Font font = new font("Monospaced", Font.PLAIN, 14);
        Color c = Color.BLACK;
        Position pos = Positions.CENTER;
        int insetPixels = 0;

        //Applying watermark

        Caption filter = new Caption(watermark, font, c, pos, insetPixels);

        BufferedImage watermark_image = filter.apply(img);

        return watermark_image;
    }
    
    public BufferedImage setWaterMarkThree(BufferedImage img) throws RemoteException {
        //setting up the watermark properties

        String watermark = "Third";
        Font font = new font("Monospaced", Font.PLAIN, 14);
        Color c = Color.BLACK;
        Positions pos = Positions.CENTER;
        int insetPixels = 0;

        //Applying watermark

        Caption filter = new Caption(watermark, font, c, pos, insetPixels);

        BufferedImage watermark_image = filter.apply(img);

        return watermark_image;
    }
}