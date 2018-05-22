import java.awt.Graphics;
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
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
    
}