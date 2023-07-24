import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Comida extends Actor
{
    public boolean isDragging = false;
    
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
                getWorld().removeObject(this);
            }
        }
    }
}
