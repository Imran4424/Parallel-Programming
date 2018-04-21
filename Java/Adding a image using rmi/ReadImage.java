import java.awt.Frame;
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
        new ReadImage().DisplayImage();
    }
    

    public void DisplayImage() throws IOException
    {
        Image img = ImageIO.read(this.getClass().getResource("butterfly.jpg"));

        Frame frame = new Frame();

        frame.setVisible(true);
    }
}