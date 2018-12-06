
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Enemy() {
        setImage("fireball.png");
        turn(5);
    }
    public Enemy(String image)
    {
        super();
        setImage("snailWalk1.png");
        getImage().mirrorHorizontally();
        walkRange=140;
        firstAct = true;
        speed= 1;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
        if (getOneObjectAtOffset(-19, -45, Hero.class) != null 
            || getOneObjectAtOffset(19, -45, Hero.class) != null) {  
           getWorld().removeObject(this);  
        } 
    }
}
