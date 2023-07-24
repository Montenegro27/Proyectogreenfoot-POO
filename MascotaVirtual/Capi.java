import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Capi extends Actor
{
    private boolean menuExtended = false;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("c"))
        {
            if (!menuExtended)
            {
                showMenu();
                menuExtended = true;
            }
            else
            {
                hideMenu();
                menuExtended = false;
            }
        }
        
        if (menuExtended && Greenfoot.mousePressed(null))
        {
            Actor target = Greenfoot.getMouseInfo().getActor();
            
            if (target != null && target instanceof Comida)
            {
                Comida comida = (Comida) target;
                recibirComida(comida);
            }
        }
    }
    
    private void showMenu()
    {
        World world = getWorld();
        world.addObject(new Hamburguesa(), getX(), getY() + 50);
        world.addObject(new Helado(), getX(), getY() + 100);
        world.addObject(new Naranja(), getX(), getY() + 150);
        world.addObject(new Pizza(), getX(), getY() + 200);
    }
    
    private void hideMenu()
    {
        World world = getWorld();
        world.removeObjects(world.getObjects(Comida.class));
    }
    
    public void recibirComida(Comida comida)
    {
        setImage("Capibara-removebg-preview.png");  // Cambia "capi_comiendo.png" por el nombre del archivo de imagen de la capibara comiendo
    }
}
