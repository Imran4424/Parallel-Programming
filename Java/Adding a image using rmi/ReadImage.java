import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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

        ImageIcon = new ImageIcon(img);

        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}