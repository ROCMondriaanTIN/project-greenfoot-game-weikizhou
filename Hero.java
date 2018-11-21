z
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public static int hero = 1;
    //
    private int GoudenMunt;
    private int ZilverenMunt;
    public boolean YellowKey =false;
    private int GemBlue;

    public static int hero = 1;
    public int GemBlue;
    public int KeyYellow;
    //public boolean KeyYellow = false;
    
    

    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p" + this.hero + "_front.png");
        
    }

   
    @Override
    public void act() {
        handleInput();
        getGoudenMunt();
        getZilverenMunt();
        getGemBlue();

        getYellowKey();
        getGemBlue();
        DeurOpen();

        getKeyYellow();

        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }
    
    //om te kijken wat de cordinatie is
    public String inspectMove()
    {
        String inspectmove= "X:"+this.getX()+"Y:"+this.getY(); 
        return inspectmove; 
    }
    
    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    public int getZilverenMunt()
    {
    if(isTouching(ZilverenMunt.class))
    {
        removeTouching(ZilverenMunt.class);
        ZilverenMunt++;    
    } 
    return ZilverenMunt;
    }
    
    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    public int getGoudenMunt()
    {
    if(isTouching(GoudenMunt.class))
    {
        removeTouching(GoudenMunt.class);
        GoudenMunt+=2;    
    }
    return GoudenMunt;
    }

       public int getGemBlue()
    {
    if(isTouching(GemBlue.class))
    {
        removeTouching(GemBlue.class);    
    } 
    return GemBlue;
    }
    
    public boolean getYellowKey()
    {
    if(isTouching(YellowKey.class))
    {
        removeTouching(YellowKey.class);
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


    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    public int getGemBlue()
    {
        if(isTouching(GemBlue.class))
    {
    removeTouching(GemBlue.class);
    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    }
    return GemBlue;
    }
    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    public int getKeyYellow()
    {
    if(isTouching(KeyYellow.class))
    {
        removeTouching(KeyYellow.class);
    }
    return KeyYellow;
    }
    
    public void level1(){
    for (Actor deur:getIntersectingObjects(DeurMid.class))
    {
        if(KeyYellow ==true){
            if(DeurMid.class!=null)
            {
                Greenfoot.setWorld(new Level2());
                String actieveWereld="Level2";
                return;
            }
        }
        break;
    }
    }
    

    public boolean opGrond()
    {
        Actor onder = getOneObjectAtOffset(0,getImage().getHeight()/2,Tile.class);
        Tile tile = (Tile) onder;
        return tile != null && tile.isSolid ==true;
    }
    
    
   
    public void handleInput() {
        if (Greenfoot.isKeyDown("space")&& opGrond()==true)
        {
            velocityY = -15;
        }
     
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -4;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 4;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
