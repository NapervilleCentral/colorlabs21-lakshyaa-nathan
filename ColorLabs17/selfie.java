import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.Color;
public class selfie
{
    
    
    
     
    public static void main(String [] args)
    {
        Picture selfie = new Picture("selfieimage/selfie.jpg");
        
        Pixel [] pixels;
        pixels = selfie.getPixels();
        for(Pixel spot:pixels){
            
        }
        selfie.explore();
    }
}
