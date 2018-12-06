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
    public  static int leven =2;
    public static int score =0;
    private int xPosLeven =20;
    private int xPosGoudenMunt =970;
    private int xPosZilverenMunt =970;
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
        update();
        latenZien();
        doodGaan();
    }    
    public void updateScorenSilver()
    {
        score+=1;
        getWorld().addObject(new Zilveren(),xPosZilverenMunt,50);
        xPosZilverenMunt-=20;
        update();
    }
    public void updateScorenGold()
    {
        score+=20;
        getWorld().addObject(new Gouden(),xPosGoudenMunt,110);
        xPosZilverenMunt-=20;
        update();
    }
    public void updateScorenGemBlue()
    {
        getWorld().addObject(new Diamant(),xPosGemBlue,170);
        xPosZilverenMunt-=20;
    }
    public void updateScorenGoldKey()
    {       
          xPosGoudenSleutel = true;
          getWorld().addObject(new GoudenSleutel(),50,110);
    }
    public void update()
    {
        if(score==20)
        {
            leven++;
            latenZien();
            score=0;
        }
    }
    public void hartjeEraf()
    {
        leven--;
        latenZien();
        doodGaan();
    }
    public void latenZien(){
        for(int i =0; i < hartje.size();i++){
        getWorld().removeObject(hartje.get(i));
        }
        hartje.clear();
        
        for(int i =0; i< leven;i++){
        Leven leven = new Leven();
        leven.setImage("hud_heartFull.png");
        getWorld().addObject(leven, 50+(i*60), 50);
        hartje.add(leven);
        }
    }
    public void doodGaan()
    {   
             if(leven==0){
             Greenfoot.setWorld(new GameOverScherm());}
    }

   
 
}