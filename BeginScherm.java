import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeginScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeginScherm extends World
{

    /**
     * Constructor for objects of class BeginScherm.
     * 
     */
    public BeginScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("BeginScherm.png");
        
        Playbutton playbutton = new Playbutton();
        addObject(playbutton,700,300);
    }
}
