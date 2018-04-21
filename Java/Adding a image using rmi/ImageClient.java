import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * ImageClient
 */
public class ImageClient 
{
    public static void main(String[] args) throws IOException
    {
        BufferedImage img = ImageIO.read(this.getClass().getResource("butterfly.jpg"))
    }
    
}