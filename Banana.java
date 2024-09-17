import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //comment ++
        move(-15);
        if(getX() <= 0)
        {
            
            int number = Greenfoot.getRandomNumber(3);
            
            
            if(number == 1)
            {
                setLocation(600,100);
            }
            else
            {
                if(number == 2){
                    setLocation(600, 300);
                }
                else{
                    setLocation(600, 200);
                }
            }
        }
        
        if(isTouching(Hero.class))
            {
                SadFace sadFace = new SadFace();
                getWorld().addObject(sadFace, 300, 200);
                getWorld().removeObject(this);
            }
    }
}
