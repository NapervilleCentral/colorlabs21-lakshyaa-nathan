import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.Color;
public class Testpic
{


    public static void main(String[]args)
    {
        Picture orig = new Picture("images/barbaraS.jpg");
        Picture maxred = new Picture("images/barbaraS.jpg");
        Picture negate = new Picture("images/barbaraS.jpg");
        Picture factor = new Picture("images/barbaraS.jpg");
        Picture gray = new Picture("images/barbaraS.jpg");
        Picture lighten = new Picture("images/barbaraS.jpg");
        Picture colorify = new Picture("images/barbaraS.jpg");
        Picture swap2 = new Picture("images/barbaraS.jpg");
        Picture swap3 = new Picture("images/barbaraS.jpg");
        
        Pixel[] pixelsC;
        pixelsC = maxred.getPixels();

        
        int count = 0;
        for (Pixel spotC : pixelsC)
        {
            //set the red value of every pixel to 255
            spotC.setRed(255);
            
            
        }
        maxred.explore();
        
        Pixel[] pixels2;
        pixels2 = negate.getPixels();
        
        int r, g, b;
        
        for (Pixel spotC : pixels2)
        {
            r = 255-spotC.getRed();
            g = 255-spotC.getGreen();
            b = 255-spotC.getBlue();
            
            spotC.setColor(new Color(r, g, b));
            
            
        }
        negate.explore();
        
        
        Pixel[] pixels3;
        pixels3 = factor.getPixels();
        count = 0;
        for (Pixel spot : pixels3)
        {
            //set the red value of the current pixel to the new value
            
            spot.setBlue((int)(spot.getBlue()*2.5));
            
        }
        factor.explore();
        
        
        Pixel[] pixels4;
        pixels4 = gray.getPixels();
        for (Pixel spot : pixels4)
        {
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            int ave = (r+g+b)/3;
            
            spot.setColor(new Color(ave, ave, ave));            
        }
        gray.explore();
        
        Pixel[] pixels5;
        pixels5 = lighten.getPixels();
        for (Pixel spot : pixels5)
        {
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            if(r+25>255||g+25>255||b+25>255){
                if(r+25>255)
                    r=255;
                if(g+25>255)
                    g=255;
                if(b+25>255)
                    b=255;
            }
            
            else
            {
                r = spot.getRed()+25;
                g = spot.getGreen()+25;
                b = spot.getBlue()+25;
            }
            spot.setColor(new Color(r,g,b));            
        }
        lighten.explore();
        
        orig.explore();
        
        Pixel[] pixels6;
        pixels6 = colorify.getPixels();
        for (Pixel spot : pixels6)
        {
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            if (r>=152&&r<=219&&g>=101&&g<=174&&b>=80&&b<=153)
            {
                spot.setColor(new Color(0, 0, 255));                   
            }
            
                     
        }
        colorify.explore();
        
        Pixel[] pixels7;
        pixels7 = swap2.getPixels();
        for (Pixel spot : pixels7)
        {
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            
            spot.setColor(new Color(g, r, b));                   
            
        }
        swap2.explore();
        
        Pixel[] pixels8;
        pixels8 = swap3.getPixels();
        for (Pixel spot : pixels8)
        {
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            
            spot.setColor(new Color(b, g, r));                   
            
        }
        swap3.explore();
    }
}
