import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class revL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class revL extends Actor
{
    /**
     * Act - do whatever the revL wants to do. This method is called whenever
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
        }// Add your action code here.
        if( Greenfoot.isKeyDown( "a" ) ){
            setRotation(z+90);
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setRotation(z-90);
        }
    }    
}
