import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelButtons extends Actor
{   
    String name;
    
    public LevelButtons(String image){
     setImage(image);
     this.name = image.replaceAll("", "");
    }
    
    /**
     * Act - do whatever the LevelButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     if(Greenfoot.mouseClicked(this)){
        switch (name){
            case "Backbutton.png":
            Greenfoot.setWorld(new BeginScherm());
            break;
            
            case "controllsbutton.png":
            Greenfoot.setWorld(new ControlsScherm());
            break;
            
            case"playbutton.png":
            Greenfoot.setWorld(new SelecteerScherm());
            break;
            
            case"PlayAgain.png":
             Greenfoot.setWorld(new BeginScherm());
             break;
        }
     }
    }    
 
}
