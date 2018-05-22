import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.rmi.Naming;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Manager
 */
public class Manager 
{
    public static void main(String[] args) throws IOException 
    {
        new Manager().Image_Operations();
    }

    public void Image_Operations() 
    {
        /**
         * Reading the Image
        */

        BufferedImage readImage = ImageIO.read(this.getClass().getResource("butterfly.jpg"));

        /**
         * Dividing the original Image 
        */
        
        BufferedImage[] splitImages = new BufferedImage[3];

        int splitHeight = readImage.getHeight()/3;
        int splitWidth = readImage.getWidth();

        for (int i = 0; i < 3; i++) 
        {
            splitImages[i] = readImage.getSubimage(0, i*splitHeight, splitWidth, splitHeight);
        }


        /**
         * Distributing spilt Images among the Employees
        */

        try 
        {
            /**
             * creating objects fro each of the employee
            */

            String url_one = "rmi://localhost/EmployeeOneService";
            ImageProcessor obj_one = (ImageProcessor) Naming.lookup(url_one);


            String url_two = "rmi://localhost/EmployeeTwoService";
            ImageProcessor obj_two = (ImageProcessor) Naming.lookup(url_two);


            String url_three = "rmi://localhost/EmployeeThreeService";
            ImageProcessor obj_three = (ImageProcessor) Naming.lookup(url_three);

            /**
             * Distributing the parts
            */

            //working on part one

            ImageIcon waterImageOne = obj_one.setWaterMark(new ImageIcon(splitImages[0]));

            BufferedImage waterImagebf_One = new BufferedImage(waterImageOne.getIconWidth(), waterImageOne.getIconHeight(), BufferedImage.TYPE_INT_RGB); 
            
            Graphics g = waterImagebf_One.createGraphics();
            waterImageOne.paintIcon(null, g, 0, 0); //paint the ImageIcon to the empty BufferedImage
            g.dispose();

            // working on part one

            ImageIcon waterImageTwo = obj_two.setWaterMark(new ImageIcon(splitImages[1]));

            BufferedImage waterImagebf_Two = new BufferedImage(waterImageTwo.getIconWidth(),
                    waterImageTwo.getIconHeight(), BufferedImage.TYPE_INT_RGB);

            Graphics g_2 = waterImagebf_Two.createGraphics();
            waterImageTwo.paintIcon(null, g_2, 0, 0); // paint the ImageIcon to the empty BufferedImage
            g_2.dispose();


            // working on part one

            ImageIcon waterImageThree = obj_three.setWaterMark(new ImageIcon(splitImages[2]));

            BufferedImage waterImagebf_Three = new BufferedImage(waterImageThree.getIconWidth(),
                    waterImageThree.getIconHeight(), BufferedImage.TYPE_INT_RGB);

            Graphics g_3 = waterImagebf_Three.createGraphics();
            waterImageThree.paintIcon(null, g_3, 0, 0); // paint the ImageIcon to the empty BufferedImage
            g_3.dispose();


            /**
             * Combining all Images
            */

            BufferedImage final_waterImage = combine_all(readImage,waterImagebf_One,waterImagebf_Two,waterImagebf_Three);



        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }


    public BufferedImage combine_all(BufferedImage readImage, BufferedImage waImg, BufferedImage waImg2,BufferedImage waImg3) 
    {
        int currentheight = 0; //this is the current height of combined image

        /**
         * taking an empty buffered image in size of main image
        */
        
        BufferedImage combined_Image = new BufferedImage(readImage.getWidth(), readImage.getHeight(), BufferedImage.TYPE_INT_RGB);

        
        Graphics2D g2d = combined_Image.createGraphics();

        for (int i = 0; i < 3; i++) 
        {
            if (i == 0) 
            {
                g2d.drawImage(waImg, 0, currentheight, null);
            }

            if (i == 1) 
            {
                g2d.drawImage(waImg2, 0, currentheight, null);
            }

            if (i == 2) 
            {
                g2d.drawImage(waImg3, 0, currentheight, null);
            }

            currentheight += img.getHeight() / 3;
        }

        g2d.dispose();

        return combined_Image;
    }
    
}