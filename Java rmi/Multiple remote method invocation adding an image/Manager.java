import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Manager
 */
public class Manager 
{
    public static void main(String[] args) throws IOException 
    {
        new Manager().Image_Operations();
    }

    public void Image_Operations() 
    {
        /**
         * Reading the Image
        */

        BufferedImage readImage = ImageIO.read(this.getClass().getResource("butterfly.jpg"));
        
    }
    
}