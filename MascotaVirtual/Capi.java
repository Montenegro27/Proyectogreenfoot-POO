import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Capi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capi extends Actor
{
    private boolean menuExtended = false;  // Variable para controlar si el menú está extendido o no
    
    public void act()
    {
        // Verifica si el jugador presiona la tecla "c"
        if (Greenfoot.isKeyDown("c"))
        {
            // Si el menú no está extendido, llama al método para extenderlo
            if (!menuExtended)
            {
                showMenu();
                menuExtended = true;
            }
            // Si el menú ya está extendido, llama al método para ocultarlo
            else
            {
                hideMenu();
                menuExtended = false;
            }
        }
    }
    
    private void showMenu()
    {
        // Agrega todas las comidas al menú
        World world = getWorld();
        world.addObject(new Chocolate(), getX(), getY());
        world.addObject(new Hamburguesa(), getX(), getY() + 50);
        world.addObject(new Helado(), getX(), getY() + 100);
        world.addObject(new Naranja(), getX(), getY() + 150);
        world.addObject(new Pizza(), getX(), getY() + 200);
    }
    
    private void hideMenu()
    {
        // Elimina todos los objetos de comida del menú
        World world = getWorld();
        world.removeObjects(world.getObjects(Comida.class));
    }
    public void recibirComida(Comida comida)
    {
        // Aquí puedes definir lo que sucede cuando la capibara recibe una comida
        // Por ejemplo, puedes cambiar la imagen de la capibara o aumentar su puntaje
    }
}
