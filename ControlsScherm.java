import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlsScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsScherm extends World
{

    /**
     * Constructor for objects of class ControlsScherm.
     * 
     */
    public ControlsScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("ControlsScherm.png");
        
        addObject(new LevelButtons("Backbutton.png"),100,100);

    }

}
  
