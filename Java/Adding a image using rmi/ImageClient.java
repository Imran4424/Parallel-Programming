import java.io.IOException;
import java.awt.Image.BufferedImage;
import java.awt.image;

import javax.imageio.ImageIO;

/**
 * ImageClient
 */
public class ImageClient 
{
    public static void main(String[] args) throws IOException
    {
        BufferedImage img = ImageIO.read(this.getClass().getResource("butterfly.jpg"));


        /**
        * Dividing original image
        */
    
        BufferedImage[] splitImages = new BufferedImage[3];
    
        int splitHeight = img.getHeight() / 3;
        int splitWidth = img.getWidth();
    
        for(int i = 0;i<3;i++)
        {
            splitImages[i] = img.getSubimage(0, i * splitHeight, splitWidth, splitHeight);
        }
    }
    

}