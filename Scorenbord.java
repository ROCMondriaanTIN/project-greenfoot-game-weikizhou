import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Scorenbord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorenbord extends Actor
{   
    public static int Leven =10;
    private int score =0;
    private int xPosLeven =20;
    private int xPosGoudenMunt =950;
    private int xPosZilverenMunt =950;
    private int xPosGemBlue = 950;
    private boolean xPosGoudenSleutel =false;
   
    ArrayList<Leven> hartje;

 
    /**
     * Act - do whatever the Scorenbord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        update();
        latenZien();
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
    public void hartjeEraf()
    {
        Leven--;
        latenZien();
    }
    public void latenZien(){
        for(int i =0; i < hartje.size();i++){
        getWorld().removeObject(hartje.get(i));
        }
        hartje.clear();
        
        for(int i =0; i< Leven;i++){
        Leven leven = new Leven();
        leven.setImage("hud_heartFull.png");
        getWorld().addObject(leven, 50+(i*60), 50);
        hartje.add(leven);
       
        /*if(leven==0)
        {
            Greenfoot.setWorld(new GameOverScherm());
        }*/
        }
    }

   
 
}
