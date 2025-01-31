import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DarksoulButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DarksoulButton extends Button
{
    public DarksoulButton(){
        GreenfootImage myButton = getImage();
        int MyNewHeight = (int)myButton. getHeight()/6;
        int MyNewWidth = (int)myButton.getWidth()/6;
        myButton.scale(MyNewWidth, MyNewHeight);
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            status = new Status(true);
            getWorldOfType(StartMenu.class).stopMusic();
            Greenfoot.setWorld(new EnergyWorld(status));
            //Greenfoot.setWorld(new BirdWorld(status));
        }
    }    
}
