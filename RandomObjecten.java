import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomObjecten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomObjecten extends Actor
{   
    String name;
    
    public  RandomObjecten(String image){
    setImage(image);
    this.name = image.replaceAll("", "");
    }
    
    /**
     * Act - do whatever the RandomObjecten wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        switch (name){
            case "hud_keyYellow_disabled.png":
            break;
            
    }    
    }

}
