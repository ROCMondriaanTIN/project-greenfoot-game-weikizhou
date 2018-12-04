import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpTile extends Actor
{   
    public int frame=1;
    /**
     * Act - do whatever the JumpTile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage("springboardDown.png");
        setImage("springboardUp.png");
        jumpAnimatie(); 
       
       
    }    
    public void jumpAnimatie()
    {   
        frame++;
        if(frame==0){
        setImage("springboardDown.png");
        }
        if(frame==1){
         setImage("springboardUp.png");
         frame=0;
        }
    }

}

