import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levens extends Actor
{
    /**
     * Act - do whatever the Levens wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage("hud_heartFull.png");
        update();     
        
    }
    public void update()
    {
    if(){
       for(int i = 0; i< Hero.levens; i++)
       {
       getWorld().addObject(new Heart) 
       } 
    }
}
