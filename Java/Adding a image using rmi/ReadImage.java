import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Image.*;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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

        ImageIcon icon = new ImageIcon(img);


        /**
         * Dividing original image
         */

        Image[] splitImages = new Image[3];

        int splitHeight = img.getHeight(observer)/3;
        int splitWidth = img.getWidth(observer);

        for(int i = 0;i < 3;i++)
        {
            splitImages[i] = 
        }


        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setSize(1200,900);

        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}