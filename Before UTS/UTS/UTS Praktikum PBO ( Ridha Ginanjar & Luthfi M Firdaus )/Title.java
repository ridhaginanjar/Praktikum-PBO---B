import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Title(){
        GreenfootImage myTitle = getImage();
        int MyNewHeight = (int)myTitle. getHeight()/6;
        int MyNewWidth = (int)myTitle.getWidth()/6;
        myTitle.scale(MyNewWidth, MyNewHeight);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
