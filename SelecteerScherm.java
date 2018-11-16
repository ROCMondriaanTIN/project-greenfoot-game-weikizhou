import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelecteerScherm extends World
{

    /**
     * Constructor for objects of class StartScherm.
     * 
     */
    public SelecteerScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg.png");
  
        Player player1 = new Player(1);
        addObject(player1,100,600);
        
        Player player2 = new Player(2);
        addObject(player2,500,600);
        
        Player player3 = new Player(3);
        addObject(player3,900,600);
    }
   
    
    
}
