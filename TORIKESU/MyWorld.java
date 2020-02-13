import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1280, 720, 1); 
        
        if(Greenfoot.isKeyDown("m")){
            JFrame frame = new JFrame();
            String value = JOptionPane.showInputDialog(frame, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }

    }
    
    public void act()
    {
        int w = getWidth();
        int h = getHeight();
    showText( "TORIKESU", w/2, h/2 ); 
    if( Greenfoot.isKeyDown( "Enter" ) ){
        World game = new WorldGame();
        Greenfoot.setWorld( game );
    }
    }
    
}
