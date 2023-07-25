import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Comida
{
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("Pizza-removebg-preview.png");
        } else {
            setImage("Pizza-removebg-preview.png");
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
                getWorld().removeObject(this); 
            }
        }
    }
}

