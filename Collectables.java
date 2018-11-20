import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collectables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collectables extends Hero
{   
    public int GoudenMunt;
    public int ZilverenMunt;
    public boolean YellowKey =false;
    public int GemBlue;
    public String naam;
    /**
     * Act - do whatever the Collectables wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Collectables(String image, String naam) {
        setImage(image);
        this.naam = naam;
    }
    public void act() 
    {
        // Add your action code here.
        getGoudenMunt();
        getZilverenMunt();
        getGemBlue();
        getYellowKey();
        getGemBlue();
        DeurOpen();
        if(naam == "GoudenMunt"&&isTouching(Collectables.class)) {
            removeTouching(Collectables.class);  
            GoudenMunt ++;
           
        } return GoudenMunt; 
        
        else if (naam == "ZilverenMunt"&&isTouching(Collectables.class)) {
            removeTouching(Collectables.class);
            ZilverenMunt ++;
        }
        applyVelocity();
    }  
    
    public int getZilverenMunt()
    {
    if(isTouching(Collectables.class))
    {
        removeTouching(Collectables.class);
        ZilverenMunt++;    
    } 
    return ZilverenMunt;
    }
    
    public int getGoudenMunt()
    {
    if(isTouching(Collectables.class))
    {
        removeTouching(Collectables.class);
        GoudenMunt+=2;    
    }
    return GoudenMunt;
    }
    
    public int getGemBlue()
    {
    if(isTouching(Collectables.class))
    {
        removeTouching(Collectables.class);    
    } 
    return GemBlue;
    }
    
    public boolean getYellowKey()
    {
    if(isTouching(Collectables.class))
    {
        removeTouching(Collectables.class);
        YellowKey =true;   
    }
    return YellowKey;
    }
    
    public void DeurOpen(){
    for (Actor deur : getIntersectingObjects(Deur.class))
    {
        if(YellowKey==true)
        {
            if(Deur.class!=null)
            {
                Greenfoot.setWorld(new Level2());
                String actieveWereld = "Level2";
                return;
            } 
        }
    
    break;
    }
    }
    
    
    
}
//Hello from a innocent bystander :]
