import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.image;
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

        try 
        {
            String url = "rmi://localhost/ImageService";

            ImageProcessor obj = (ImageProcessor) Naming.lookup(url);

            BufferedImage waterImg = obj.setWaterMarkOne(splitImages[0]);

            BufferedImage waterImg2 = obj.setWaterMarkOne(splitImages[1]);

            BufferedImage waterImg3 = obj.setWaterMarkOne(splitImages[2]);

            BufferedImage finalImage = combine_all(img,waterImg,waterImg2,waterImg3);


            //disaplaying images

            JLabel origianlImg = new JLabel(new ImageIcon(img));

            JLabel processImg = new JLabel(new ImageIcon(finalImage));

            JFrame frame = new JFrame();
            frame.setSize(1200,900);

            frame.setLayout(new FlowLayout());

            frame.add(origianlImg);
            frame.add(processImg);

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } catch (MalformedURLException malurl) {
            System.out.println();
            System.out.println("Malfromed URL Exception");
            System.out.println(malurl);

        } catch (RemoteException re) {
            System.out.println();
            System.out.println("Remote Exception");
            System.out.println(re);
        } catch (NotBoundException notbe) {
            System.out.println();
            System.out.println("Not Bound Exception");
            System.out.println(notbe);
        } catch (ArithmeticException arexc) {
            System.out.println();
            System.out.println("Arithematic Exception");
            System.out.println(arexc);
        }

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