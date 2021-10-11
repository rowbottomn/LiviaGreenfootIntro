import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    SimpleTimer hungerTimer;
    Player myPet;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1, false); 
        hungerTimer = new SimpleTimer();
        myPet = new Player();
        addObject(myPet, 200, 200);
    }
    
    
    public void act(){
        showText("Time: "+hungerTimer.millisElapsed()/1000, getWidth()/2, getHeight()/2);
        
    }
}
