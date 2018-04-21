import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * ReadImage
 */

public class ReadImage 
{
    public static void main(String[] args) throws IOException 
    {
        
    }
    

    public void DisplayImage() throws IOException
    {
        Image img = ImageIO.read(new File("butterfly.jpg"));
    }
}