import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helado extends Comida
{
    /**
     * Act - do whatever the Helado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("Helado-removebg-preview.png");
        } else {
            setImage("Helado-removebg-preview.png");
        }
        
        if (Greenfoot.mousePressed(this) && !isDragging) {
            isDragging = true;
        }
        
        if (Greenfoot.mouseDragged(this) && isDragging) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        if (Greenfoot.mouseDragEnded(this) && isDragging) {
            isDragging = false;
            
            Actor target = getOneIntersectingObject(Capi.class);
            
            if (target != null && target instanceof Capi) {
                Capi capi = (Capi) target;
                capi.recibirComida(this);
                setLocation(150, 150); 
            }
        }
    }
}