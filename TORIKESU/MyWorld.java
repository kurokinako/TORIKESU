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
<<<<<<< HEAD
        super(600, 400, 1); 
=======
        super(1280, 720, 1); 
        
        if(Greenfoot.isKeyDown("m")){
            JFrame frame = new JFrame();
            String value = JOptionPane.showInputDialog(frame, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }
>>>>>>> 172d4e57069490429413c129c2fa62bee54009c7
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "Enter" ) ){
        World game = new WorldGame();
        Greenfoot.setWorld( game );
    }
    }
    
}
