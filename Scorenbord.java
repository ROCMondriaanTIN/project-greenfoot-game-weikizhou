import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scorenbord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorenbord extends Actor
{   
    private int Leven =2;
    private int score =0;
    private int xPosLeven =20;
    private int xPosGoudenMunt =20;
    private int xPosZilverenMunt =20;
    private int xPosGemBlue = 20;
    /**
     * Act - do whatever the Scorenbord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        update();
    }    
    public void updateScorenZ()
    {
    score++;
    getWorld().addObject(new Zilveren(),xPosZilverenMunt,140);
    xPosZilverenMunt+=20;
    update();
    }
    public void updateScorenG()
    {
    score++;
    getWorld().addObject(new Gouden(),xPosGoudenMunt,190);
    xPosZilverenMunt+=20;
    update();
    }
       public void updateScorenGB()
    {
    score++;
    getWorld().addObject(new Diamant(),xPosGemBlue,240);
    xPosZilverenMunt+=20;
    update();
    }
    public void update()
    {
        if(score==40)
        {
            Leven++;
            getWorld().addObject(new Leven(),xPosLeven,40);
            xPosLeven+=50;
            score=0;
        }
    }
}
