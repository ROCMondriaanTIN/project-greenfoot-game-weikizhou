
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private int goudenMunt;
    private int zilverenMunt;
   

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        getGoudenMunt();
        getZilverenMunt();
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
    
     public int getZilverenMunt()
    {
    if(isTouching(zilverenMunt.class))
    {
        removeTouching(zilverenMunt.class);
        zilverenMunt++;    
    }
    return zilverenMunt;
    }
    
    public int getGoudenMunt()
    {
    if(isTouching(goudenMunt.class))
    {
        removeTouching(goudenMunt.class);
        goudenMunt++;    
    }
    return goudenMunt;
    }
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("space")) {
            velocityY = -10;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 2;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
