import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scorenbord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorenbord extends Actor
{   
    public static int Leven =2;
    private int score =0;
    private int xPosLeven =20;
    private int xPosGoudenMunt =950;
    private int xPosZilverenMunt =950;
    private int xPosGemBlue = 950;
    private boolean xPosGoudenSleutel =false;
 
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
        score+=1;
        getWorld().addObject(new Zilveren(),xPosZilverenMunt,60);
        xPosZilverenMunt-=20;
        update();
    }
    public void updateScorenG()
    {
        score+=2;
        getWorld().addObject(new Gouden(),xPosGoudenMunt,100);
        xPosZilverenMunt-=20;
        update();
    }
    public void updateScorenGB()
    {
        getWorld().addObject(new Diamant(),xPosGemBlue,140);
        xPosZilverenMunt-=20;
    }
    /*public void updateScorenH()
    {   
        //getWorld().removeObject(this);
        Leven-=1;
        update();
    }*/
    public void updateScorenGS()
    {       
          xPosGoudenSleutel = true;
          getWorld().addObject(new GoudenSleutel(),500,60);
    }
    public void update()
    {
        if(score==20)
        {
            Leven++;
            getWorld().addObject(new Leven(),xPosLeven,40);
            xPosLeven+=50;
            score=0;
        }
        if(Leven==0)
        {
            Greenfoot.setWorld(new GameOverScherm());
        }
    }
}
