import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldGame extends World
{

    /**
     * Constructor for objects of class WorldGame.
     * 
     */
    public WorldGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
     public void act() 
    {
        
        GreenfootImage img1 = new GreenfootImage( "images/game_bg.png" );
        img1.scale(366,508);
        int w = getWidth();
        int h = getHeight();
        getBackground().drawImage( img1, 470, 150 );
        
        
    }    
}
