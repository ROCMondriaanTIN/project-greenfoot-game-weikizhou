import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VictoryScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryScherm extends World
{
    String actieveWereld = "VictoryScherm";
    /**
     * Constructor for objects of class VictoryScherm.
     * 
     */
    public VictoryScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("VictoryScherm.png");
            addObject(new LevelButtons("PlayAgain.png"),100,100);
    }
}
