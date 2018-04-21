import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Image.*;
import java.awt.image.BufferedImage;
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
        BufferedImage img = ImageIO.read(this.getClass().getResource("butterfly.jpg"));

        ImageIcon icon = new ImageIcon(img);


        /**
         * Dividing original image
         */

        BufferedImage[] splitImages = new BufferedImage[3];

        int splitHeight = img.getHeight()/3;
        int splitWidth = img.getWidth();

        for(int i = 0;i < 3;i++)
        {
            splitImages[i] = img.getSubimage(splitWidth, i*splitHeight, splitWidth, splitHeight);

            try 
            {
                
            } catch (Exception e) {
                //TODO: handle exception
            }
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