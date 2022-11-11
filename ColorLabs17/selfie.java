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
        Picture selfie2 = new Picture("selfieimage/selfie.jpg");
        
        selfie.explore();
        // method 1 -----------------------------
        
        Pixel [] pixels;
        pixels = selfie.getPixels();
        for(Pixel spot:pixels){
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            double ave = (r+g+b)/3;
            
            if (ave<63.75){ //darkest
                spot.setColor(new Color(0,0,139));
            }
            if (ave>=63.75&&ave<127.5){ //second darkest
                spot.setColor(new Color(178,34,34));
            }
            if (ave>=127.5&&ave<255){ //second lightest
                spot.setColor(new Color(32,178,170));
            }
            if (ave>=255){ //lightest
                spot.setColor(new Color(255,248,220));
            }
        }
        selfie.explore();
        //selfie.write("images/selfie.jpg");
        
        
        //method 2-------------------------------------------
        Pixel [] pixels1;
        pixels1 = selfie1.getPixels();
        double big = 0;
        double s = 255;
        for(Pixel spot:pixels1){
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            int ave = (int)((r+g+b)/3);
            spot.setColor(new Color(ave, ave, ave));
            
            if(ave>b)
                big=ave;
            else if(ave<s)
                s=ave;
                
            
            
        }
            //loop
            double interval = (big-s)/4;
        for(Pixel spot:pixels1){
            if(spot.getRed()<interval){
                spot.setColor(new Color(0,0,139));
            }
            else if(spot.getRed()>=interval&&spot.getRed()<(interval*2)){
                spot.setColor(new Color(178,34,34));
            }
            else if(spot.getRed()>=(interval*2)&&spot.getRed()<=(interval*3)){
                spot.setColor(new Color(32,178,170));
            }
            else if(spot.getRed()>=(interval*3)&&spot.getRed()<=big){
                spot.setColor(new Color(255,248,220));
            }            
        }
            
        
        selfie1.explore();
    }
}
