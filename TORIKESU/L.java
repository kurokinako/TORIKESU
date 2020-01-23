import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;
/**
 * Write a description of class L here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L extends Actor
{
   /**
     * Act - do whatever the badsquare wants to do. This method is called whenever
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
               setLocation( x-50,y );
           }
           if( Greenfoot.isKeyDown( "right" ) ){
                setLocation( x+50,y );
           }
           if( Greenfoot.isKeyDown( "down" ) ){
               setLocation( x,y+50 );
            }
           if( Greenfoot.isKeyDown( "a" ) ){
               turn(90);
               Greenfoot.delay(5);
           }
           if( Greenfoot.isKeyDown( "d" ) ){
               turn(-90);
               Greenfoot.delay(5);
           }
        }
    }    
}
