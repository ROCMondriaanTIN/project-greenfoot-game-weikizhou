import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Hero
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int hero;
    public void act() 
    {
        // Add your action code here.
        
        //hier zendt ik de players naar level1
        click();
    } 
    public String getInspect()
    {
    String getInspect="X:"+this.getX()+"Y:"+this.getY();
    return getInspect;
    }
    public Player(int i){
        this.hero = i;
        setImage("p" + i + "_front.png");
    }
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Hero.hero = this.hero;
            Greenfoot.setWorld(new Level1());
        }
    }
    
}
