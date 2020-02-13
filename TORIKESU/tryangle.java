import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tryangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tryangle extends Actor
{
    /**
     * Act - do whatever the tryangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if(y<650){
           setLocation( x,y+20 );
           Greenfoot.delay(50);
           if( Greenfoot.isKeyDown( "left" ) ){
               setLocation( x+1,y );
            }
           if( Greenfoot.isKeyDown( "left" ) ){
                setLocation( x-1,y );
           }
           if( Greenfoot.isKeyDown( "down" ) ){
               setLocation( x,y+1 );
            }
           if( Greenfoot.isKeyDown( "a" ) ){
               turn(90);
               Greenfoot.delay(10);
           }
           if( Greenfoot.isKeyDown( "d" ) ){
               turn(-90);
               Greenfoot.delay(10);
           }
        }
    }    
}
