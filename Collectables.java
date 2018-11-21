//
//import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//
///**
// * Write a description of class Collectables here.
// *
// * @author (your name)
// * @version (a version number or a date)
// */
//public class Collectables extends Hero {
//
//    public int coinGold;
//    public int coinSilver;
//    public boolean keyYellow; 
//    public int gemBlue;
//    public String naam;
//
//    /**
//     * Act - do whatever the Collectables wants to do. This method is called
//     * whenever the 'Act' or 'Run' button gets pressed in the environment.
//     */
//    public Collectables() {
//
//    }
//
//    // 
//    public Collectables(String image) {
//        setImage(image);
//        this.naam = image.replaceFirst(".png", "");
//    }
//
//    @Override
//    public void act() {
//        // Add your action code here.
//        applyVelocity();
//
//        if (isTouching(Hero.class)) {
//            if ("keyYellow".equals(naam)) {
//                keyYellow = true;
//                setLocation(getX(),getY()-50);
//                
//
//            } else if ("coinSilver".equals(naam)) {
//                coinSilver++;
//                setLocation(500,150);
//            }
//          // getWorld().removeObject(this);
//
//        }
//    }
//
//    /*public boolean getYellowKey()
//    {
//    if(isTouching(Collectables.class))
//    {
//        removeTouching(Collectables.class);
//        YellowKey =true;   
//    }
//    return YellowKey;
//    }*/
//    
//    
//    
////    public void DeurOpen() {
////        for (Actor deur : getIntersectingObjects(Deur.class)) {
////            if (keyYellow == true) {
////                if (deur != null) {
////                    Greenfoot.setWorld(new Level2());
////                }
////            }
////
////            break;
////        }
//// 
////    }
//}

