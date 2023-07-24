import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hamburguesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hamburguesa extends Comida
{
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("Hamburguesa-removebg-preview.png");
        } else {
            setImage("Hamburguesa-removebg-preview.png");
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
// Add your action code here.
