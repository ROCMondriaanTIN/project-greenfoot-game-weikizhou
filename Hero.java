
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
    public boolean YellowKey = false;
    private int GemBlue;
    
    public static int Leven =2;
    
    public int direction = 2;
    public int animationTimer = 0;
    public int PicNum = 1;
    
    private Hero hero1;

    
    Scorenbord scb;
    
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
        DeurOpen();
        
       
        
        if(scb ==null)
        {
        scb = new Scorenbord();
        getWorld().addObject(scb, -10,-10);
        }

        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                //getWorld().removeObject(this);
                scb.updateScorenHeart();}
                
                else if(Leven>0){
                this.setLocation(200, 1400);
                
                // hero1 = new Hero();
                //getWorld().addObject(new Hero(),200,1400);
            }
                
                break;
            
        }
    }
    //om te kijken wat de cordinatie is
    public String inspectMove() {
        String inspectmove = "X:" + this.getX() + "Y:" + this.getY();
        return inspectmove;
    }

    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    public int getZilverenMunt() {
        if (isTouching(ZilverenMunt.class)) {
            removeTouching(ZilverenMunt.class);
            scb.updateScorenSilver();
            ZilverenMunt++;
        }
        return ZilverenMunt;
    }

    //hier zorg je ervoor dat het object weggaat als je het aanraakt
    public int getGoudenMunt() {
        if (isTouching(GoudenMunt.class)) {
            removeTouching(GoudenMunt.class);
            scb.updateScorenGold();
            GoudenMunt += 2;
        }
        return GoudenMunt;
    }

    public int getGemBlue() {
        if (isTouching(GemBlue.class)) {
            removeTouching(GemBlue.class);
            scb.updateScorenGemBlue();
        }
        return GemBlue;
    }

    public boolean getYellowKey() {
        if (isTouching(YellowKey.class)) {
            removeTouching(YellowKey.class);
            scb.updateScorenGoldKey();
            YellowKey = true;
        }
        return YellowKey;
    }

    public void DeurOpen() {
        for (Actor deur : getIntersectingObjects(Deur.class)) {
            if (YellowKey == true) {
                if (Deur.class != null) {
                    Greenfoot.setWorld(new Level2());
                    String actieveWereld = "Level2";
                    return;
                }
            }
            break;
        }
    }

    public boolean opGrond() {
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight() / 2, Tile.class);
        Tile tile = (Tile) onder;
        return tile != null && tile.isSolid == true;
    }

    public void handleInput() {
        animatieStanding();
        animatieJump();
        if (keySpace() && opGrond() == true) {
            velocityY = -14;
        } else if (Greenfoot.isKeyDown("up") && opGrond() == true) {
            velocityY = -14;
        }

        if (keyLeft() && keyRight() == false) {
            velocityX = -4;
            direction = 1;
            if (animationTimer % 10 == 0 && velocityY == 0) {
                animatie();
            }
            animationTimer++;

        } else if (keyRight()) {
            velocityX = 4;
            direction = 2;
            if (animationTimer % 10 == 0 && velocityY == 0) {
                animatie();
            }
            animationTimer++;
        }
    }

    
    public void animatie() {
        if (PicNum == 1) {
            setImage("alien" + Hero.hero + "_walk" + direction + "1.png");
        } else if (PicNum == 2) {
            setImage("alien" + Hero.hero + "_walk" + direction + "2.png");
            PicNum = 1;
            return;
        }
        PicNum++;
    }

    public void animatieJump() {
        if (velocityY != 0) {
            setImage("alien" + Hero.hero + "_jump" + direction + ".png");
        }
    }

    public void animatieStanding() {
        if (keySpace() == false && keyLeft() == false && keyRight() == false && velocityY == 0) {
            setImage("alien" + Hero.hero + "_stand" + direction + ".png");
        }
    }

    
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }

    
    public boolean keySpace() {
        boolean keySpace = Greenfoot.isKeyDown("space");
        return keySpace;
    }

    public boolean keyRight() {
        boolean keyRight = Greenfoot.isKeyDown("right");
        return keyRight;
    }

    public boolean keyLeft() {
        boolean keyLeft = Greenfoot.isKeyDown("left");
        return keyLeft;
    }

   
    
    
}
