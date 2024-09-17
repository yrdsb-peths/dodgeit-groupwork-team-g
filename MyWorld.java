import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Banana banana1;
    private Banana banana2;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Hero hero = new Hero();
        banana1 = new Banana();
        banana2 = new Banana();
        addObject(banana1, 600, 100);
        addObject(banana2, 800, 300);
        addObject(hero, 100, 100);
    }
    
    public void removeAllBananas()
    {
        removeObject(banana1);
        removeObject(banana2);
    }
}
