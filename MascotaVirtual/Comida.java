import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Comida extends Actor
{
    private boolean isDragging = false;  // Variable para saber si el actor está siendo arrastrado
    
    public void act()
    {
        // Muestra el cursor de mano cuando el mouse está sobre un objeto Comida
        if (Greenfoot.mouseMoved(this)) {
            setImage("Hamburguesa-removebg-preview.png");  // Cambia "comida.png" por el nombre del archivo de imagen de la comida
        } else {
            setImage("Hamburguesa-removebg-preview.png");  // Cambia "comida.png" por el nombre del archivo de imagen de la comida
        }
        
        // Si el usuario hace clic en la comida y no está siendo arrastrada, la marca como arrastrada
        if (Greenfoot.mousePressed(this) && !isDragging) {
            isDragging = true;
        }
        
        // Si el usuario mantiene presionado el clic del mouse y la comida está marcada como arrastrada, la mueve con el mouse
        if (Greenfoot.mouseDragged(this) && isDragging) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        // Si el usuario suelta el clic del mouse y la comida estaba siendo arrastrada, se verifica si se entregó a la capibara
        if (Greenfoot.mouseDragEnded(this) && isDragging) {
            isDragging = false;
            
            // Obtiene el actor con el que se colisiona en el momento del soltar el clic del mouse
            Actor target = getOneIntersectingObject(Capi.class);
            
            // Si el target es la capibara, se entrega la comida a la capibara y se remueve del mundo
            if (target != null && target instanceof Capi) {
                Capi capi = (Capi) target;
                capi.recibirComida(this);
                getWorld().removeObject(this);
            }
        }
    }
}

