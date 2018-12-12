import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Scorenbord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCounter extends Actor
{   
    public int score =0;
    private int xPosGemBlue = 970;
    private boolean xPosGoudenSleutel =false;

    ArrayList<Leven> hartje =new ArrayList<Leven>();
    /**
     * Act - do whatever the Scorenbord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        updateLeven();
        latenZien();
        doodGaan();
    } 

    public void updateScorenGemBlue()
    {
        getWorld().addObject(new Diamant(),xPosGemBlue,160);
        xPosGemBlue -=20;
    }
    
    public void updateScorenGoldKey()
    {       
          xPosGoudenSleutel = true;
          getWorld().addObject(new GoudenSleutel(),50,110);
    }
    public void updateLeven()
    {
        if(score==20)
        {
            Hero.leven++;
            latenZien();
            score=0;
        }
    }
    public void hartjeEraf()
    {
        Hero.leven--;
        latenZien();
        doodGaan();
    }
    public void latenZien(){
        for(int i =0; i < hartje.size();i++){
        getWorld().removeObject(hartje.get(i));
        }
        hartje.clear();
        
        for(int i =0; i< Hero.leven;i++){
        Leven leven = new Leven();
        leven.setImage("hud_heartFull.png");
        getWorld().addObject(leven, 50+(i*60), 50);
        hartje.add(leven);
        }
    }
    public void doodGaan()
    {   
            if(Hero.leven==0)
            {
             Greenfoot.setWorld(new GameOverScherm());
            }
    }

   
 
}
