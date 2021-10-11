import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    MyWorld world;
        
    /**
     * This class actually represents the players pet.  This is the primary way the user will intereact with the game.
     */
    public void act()
    {
        if (world==null){
            world = (MyWorld)getWorld();
        }
        // Add your action code here.
        setLocation(getX()+5, getY());
        if (getX()>world.getWidth()){
            setLocation(0, getY());
        }
    }
}
