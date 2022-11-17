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
            if (ave>=127.5&&ave<191.25){ //second lightest
                spot.setColor(new Color(32,178,170));
            }
            if (ave>=191.25){ //lightest
                spot.setColor(new Color(255,248,220));
            }
        }
        selfie.explore();
        
        
        
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
        
        
        // method 3 -----------------------------------
        Pixel [] pixels2;
        pixels2 = selfie2.getPixels();
        int r, g, b;
        
        for(Pixel spot:pixels2){
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            double ave = (r+g+b)/3;
            
            if(ave<40)
                spot.setColor(new Color(20, 32, 125)); //dark blue
            else if(ave>40&&ave<60)
                spot.setColor(new Color(237, 109, 118)); //pink
            else if(ave>=60&&ave<100)
                spot.setColor(new Color(236, 43, 43)); // red
            else if(ave>=100&&ave<140)
                spot.setColor(new Color(32,178,170)); //light blue
            else if(ave>=140)
                spot.setColor(new Color(255, 246, 205)); //white
            
        }
        selfie2.explore();
        selfie2.write("selfieimage/SFmyfinal.jpg");
        
    }
}


