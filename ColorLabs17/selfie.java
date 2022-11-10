import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.Color;
public class selfie
{
    
    
    
     
    public static void main(String [] args)
    {
        Picture selfie = new Picture("selfieimage/selfie.jpg");
        Picture selfie1 = new Picture("selfieimage/selfie.jpg");
        
        
        selfie.explore();
        // method 1 -----------------------------
        Pixel [] pixels;
        pixels = selfie.getPixels();
        for(Pixel spot:pixels){
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            double ave = (r+g+b)/3;
            
            if (ave<70){ //darkest
                spot.setColor(new Color(0,0,139));
            }
            if (ave>=70&&ave<100){ //second darkest
                spot.setColor(new Color(178,34,34));
            }
            if (ave>=100&&ave<140){ //second lightest
                spot.setColor(new Color(32,178,170));
            }
            if (ave>=140){ //lightest
                spot.setColor(new Color(255,248,220));
            }
        }
        selfie.explore();
        
        //method 2-------------------------------------------
        
    }
}
