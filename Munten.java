
//import static Scorenbord.leven;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Munten here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Munten extends Mover {

    String name;
    boolean opgepakt = false;
    

    
    public static int xPosZilverenMunt = 950;
    public static int xPosGoudenMunt = 950;
    
    LifeCounter LC;
    public Munten(String image, boolean opgepakt) {
        setImage(image);
        this.opgepakt = opgepakt;
        this.name = image.replaceAll(".png", "");
    }
    public Munten(){}
    /**
     * Act - do whatever the Munten wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(LC ==null)
        {
        LC = new LifeCounter();
        getWorld().addObject(LC, -10,-10);
        }
        
        
        if (!opgepakt) {
            applyVelocity();
        }

        if (isTouching(Hero.class)) {
            switch (name) {
                case "coinSilver":
                
                    getWorld().addObject(new Munten("coinSilver.png", true), xPosZilverenMunt, 50);
                    getWorld().removeObject(this);
                    xPosZilverenMunt -= 25; 
                    Hero.score+=1;
                    LC.updateLeven();
                    break;
                case "coinGold":
                   
                    getWorld().addObject(new Munten("coinGold.png", true), xPosGoudenMunt, 100);
                    getWorld().removeObject(this);
                    xPosGoudenMunt -= 25;
                    Hero.score+=2;
                    LC.updateLeven();
                    break;
            }
        }
        
    }
   

    public void ResetLocatie(){
     xPosZilverenMunt=950;
     xPosGoudenMunt=950; 
    }
}
