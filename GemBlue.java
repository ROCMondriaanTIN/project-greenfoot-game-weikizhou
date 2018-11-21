import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemBlue extends Mover
{
    /**
     * Act - do whatever the GemBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage("gemBlue.png");
        applyVelocity();
    }    
}
