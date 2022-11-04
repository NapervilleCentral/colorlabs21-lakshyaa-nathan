
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path
     //Picture apic = new Picture("images\\beach.jpg");
     Picture cute = new Picture("images/kittens2.jpg");
     //object     makes mem    constructor - holds different attributes about the object
     //                 default contructor when there is nothing inside the parentheses
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     
     Picture w2 = new Picture("images/wall.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
    
     //apic.explore();
     ferris1.explore();
     //      method
     
     //makes an array of pixels--GIVEN YOU NEED THIS
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels(); //GET ALL THE PIXELS
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index
    System.out.println(pixels[17]);
    pixels[17].setColor(Color.yellow);
    //access each pixel
    //Pixel spot = ferris1.getPixel(100,100);
    
    //System.out.println(pixels[17].getColor());
    //System.out.println(spot);
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/
 
 
 /**
  * Messing with the cat, hope he does not bite
  */
 
    int count=0;
    Pixel[] pixelsC;
    pixelsC = cute.getPixels(); //GET ALL THE PIXELS
    // or Color myFav = new Color(218,212,214);
    for (Pixel spotC : pixelsC)
        {
            int r= spotC.getRed();
            int g  = spotC.getGreen();
            int b = spotC.getBlue();
            //black = (0,0,0)
            
            if(r<=26 && g<=27 && b<=31)
                {
                spotC.setRed(128);
                spotC.setGreen(0);
                spotC.setBlue(0);
                }
            
        }
    cute.explore();
    ferris1.explore();
 
 
 for (Pixel spot : pixels)
        {
            //set the red value of the current pixel to the new value
            spot.setRed((int)(spot.getRed()*.5));
            
            if(count%2==0)
            {
                spot.setColor(new Color(218,2,214));
            }
            count++;
        }
 
 
 

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 
    

 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
