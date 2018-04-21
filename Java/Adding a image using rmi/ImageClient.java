import java.io.IOException;
import java.awt.image;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

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

        try 
        {
            String url = "rmi://localhost/ImageService";

            ImageProcessor obj = (ImageProcessor) Naming.lookup(url);

            BufferedImage waterImg = obj.setWaterMarkOne(splitImages[0]);

            BufferedImage waterImg2 = obj.setWaterMarkOne(splitImages[1]);

            BufferedImage waterImg3 = obj.setWaterMarkOne(splitImages[2]);
            

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
    

}