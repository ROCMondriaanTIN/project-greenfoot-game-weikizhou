
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
    
    public static int leven;
    
    //animatie
    public int direction = 2;
    public int animationTimer = 0;
    public int PicNum = 1;
    
    private Hero hero1;

    LifeCounter LC;
    //Scorenbord scb;
    Munten m;
   
    
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
        getGemBlue();
        getYellowKey();
        DeurOpen2();
        DeurOpen3();
        DeurOpen4();
        JumpTile();
        
   
        //Om LifeCounter te connecten met mijn hero
          if(LC ==null)
        {
        LC = new LifeCounter();
        getWorld().addObject(LC, -10,-10);
        }
        //M zorgt ervoor dat ik de locatie weer reset
        if(m ==null)
        {
        m = new Munten();
        getWorld().addObject(m, -10,-10);
        }

        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) 
        {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
               if (enemy != null)
               {
                  setLocation(200,1400);
                  LC.hartjeEraf();
                  break;
            
               }
        }     
    
        for(Actor lavaTile: getIntersectingObjects(LavaTile.class)) {
               if (lavaTile != null)
               {
                    this.setLocation(470, 1635);
                    LC.hartjeEraf();
                    break;
               }
        }
    } 
    public void JumpTile()
    {
        for(Tile jumpTile: getIntersectingObjects(JumpTile.class)) {
          velocityY=-25;
          break;
        }
    }    
    
    //om te kijken wat de cordinatie is
    public String inspectMove()
    {
        String inspectmove = "X:" + this.getX() + "Y:" + this.getY();
        return inspectmove;
    }
    
    public int getGemBlue() {
        if (isTouching(GemBlue.class)) {
            removeTouching(GemBlue.class);
            LC.updateScorenGemBlue();
        }
        return GemBlue;
    }

    public boolean getYellowKey() {
        if (isTouching(YellowKey.class)) {
            removeTouching(YellowKey.class);
            LC.updateScorenGoldKey();
            YellowKey = true;
        }
        return YellowKey;
    }

    public void DeurOpen2() {
        for (Actor deur : getIntersectingObjects(Deur.class)) {
            if (YellowKey == true) {
                if (Deur.class != null) {
                    Greenfoot.setWorld(new Level2());
                    m.Reset();
                    String actieveWereld = "Level2";
                  
                }
            }
            break;
        }
    }
    public void DeurOpen3() {
        for (Actor deur : getIntersectingObjects(Deur.class)) {
            if (YellowKey == true) {
                if (Deur.class != null) {
                    Greenfoot.setWorld(new Level3());
                    m.Reset();
                    String actieveWereld = "Level3";
                 
                }
            }
            break;
        }
    }
    public void DeurOpen4() {
        for (Actor deur : getIntersectingObjects(Deur.class)) {
            if (YellowKey == true) {
                if (Deur.class != null) {
                    Greenfoot.setWorld(new Level4());
                    m.Reset();
                    String actieveWereld = "Level4";
                  
                }
            }
            break;
        }
    }

    public boolean onGround() {
        Actor underLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Actor underRight = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Tile tile1 = (Tile) underLeft;
        Tile tile2 = (Tile) underRight;
        return (tile1 != null && tile1.isSolid) || (tile2 != null && tile2.isSolid);
    }

    public void handleInput() {
        animatieStanding();
        animatieJump();
        if (keySpace() && onGround() == true) {
            velocityY = -14;
        } else if (Greenfoot.isKeyDown("up") && onGround() == true) {
            velocityY = -14;
        }

        if (keyLeft() && keyRight() == false) {
            velocityX = -7;
            direction = 1;
            if (animationTimer % 10 == 0 && velocityY == 0) {
                animatie();
            }
            animationTimer++;

        } else if (keyRight()) {
            velocityX = 7;
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
   
    
      public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    
}
