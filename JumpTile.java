import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpTile extends Tile
{   
  
    /**
     * Act - do whatever the JumpTile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
               setImage("springboardDown.png");
    }    
    public JumpTile(String image, int width, int height)
    {
        super(image, width, height);

    }


   
}
