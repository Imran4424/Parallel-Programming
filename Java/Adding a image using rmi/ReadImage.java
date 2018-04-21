import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 * ReadImage
 */

public class ReadImage 
{
    public static void main(String[] args) throws IOException 
    {
        new ReadImage().DisplayImage();
    }
    

    public void DisplayImage() throws IOException
    {
        Image img = ImageIO.read(this.getClass().getResource("butterfly.jpg"));

        JFrame 
    }
}