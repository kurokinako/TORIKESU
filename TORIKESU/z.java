import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class z extends Actor
{
    /**
     * Act - do whatever the z wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
       int y = getY();
       if(y<650)
       {
           setLocation( x,y+20 );
           Greenfoot.delay(50);
       }
    }    
}
