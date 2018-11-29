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
   
    private Leven leven1;
    private Leven leven2;
 
    /**
     * Act - do whatever the Scorenbord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        leven1 = new Leven();
        leven1.setImage("hud_heartFull.png");
        getWorld().addObject(leven1, 50, 50);
        
        leven2 = new Leven();
        leven2.setImage("hud_heartFull.png");
        getWorld().addObject(leven2, 110, 50);
        // Add your action code here.
        update();
        
    }    
    public void updateScorenSilver()
    {
        score+=1;
        getWorld().addObject(new Zilveren(),xPosZilverenMunt,60);
        xPosZilverenMunt-=20;
        update();
    }
    public void updateScorenGold()
    {
        score+=2;
        getWorld().addObject(new Gouden(),xPosGoudenMunt,100);
        xPosZilverenMunt-=20;
        update();
    }
    public void updateScorenGemBlue()
    {
        getWorld().addObject(new Diamant(),xPosGemBlue,140);
        xPosZilverenMunt-=20;
    }
    /*public void updateScorenHeart()
    {   
        if(leven1!=null)
        {
            getWorld().removeObject(leven1);
            Leven-=1;
            if(Leven==0)
            {
             Greenfoot.setWorld(new GameOverScherm());
            }
        }
        
        else if(leven2!=null)
        {
           getWorld().removeObject(leven2);
           Leven-=1;
           if(Leven==0)
           {
             Greenfoot.setWorld(new GameOverScherm());
            }
        }
    }*/
    public void updateScorenGoldKey()
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
    }
        public void updateScorenHeart()
    {   
        if(leven1!=null)
        {
            getWorld().removeObject(leven1);
            Leven-=1;
            if(Leven<=0)
            {
             Greenfoot.setWorld(new GameOverScherm());
            }
        }
        
        else if(leven2!=null)
        {
           getWorld().removeObject(leven2);
           Leven-=1;
           if(Leven<=0)
           {
             Greenfoot.setWorld(new GameOverScherm());
           }
        }
    }
 
}
