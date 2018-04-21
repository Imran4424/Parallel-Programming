import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ImageClient
 */
public class ImageClient 
{
    public static void main(String[] args) throws IOException
    {
        

    }

    public void Image_operations() throws IOException
    {
        
    }
    
    public BufferedImage combine_all(BufferedImage img,BufferedImage waImg,BufferedImage waImg2, BufferedImage waImg3)
    {
        int currentheight = 0;

        BufferedImage combined_Image = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = combined_Image.createGraphics();

        for(int i=0;i<3;i++)
        {
            if(i==0)
            {
                g2d.drawImage(waImg, 0, currentheight, null);
            }

            if (i == 1) {
                g2d.drawImage(waImg2, 0, currentheight, null);
            }

            if (i == 2) {
                g2d.drawImage(waImg3, 0, currentheight, null);
            }

            currentheight += img.getHeight()/3;
        }

        g2d.dispose();

        return combined_Image;
    }


}