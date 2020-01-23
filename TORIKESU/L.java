import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class L here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L extends Actor
{
    /**
     * Act - do whatever the L wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        int z = 0;
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+1,y );
        }// Add your action code here.
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-1,y );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+1 );
        }
        if( Greenfoot.isKeyDown( "a" ) ){
            setRotation(z+90);
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setRotation(z-90);
        }
    }    
}
