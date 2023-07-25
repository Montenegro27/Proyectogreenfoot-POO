import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        super(600, 400, 1); 
        prepare();        

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        Capi capi = new Capi();
        addObject(capi,35,54);
        capi.setLocation(420,207);
        capi.setLocation(411,279);
        Hamburguesa hamburguesa = new Hamburguesa();
        addObject(hamburguesa,36,361);
        Helado helado = new Helado();
        addObject(helado,562,363);
        Naranja naranja = new Naranja();
        addObject(naranja,568,204);
        Pizza pizza = new Pizza();
        addObject(pizza,163,302);
        Comida comida = new Comida();
        addObject(comida,500,90);
        comida.setLocation(410,268);
        capi.setLocation(421,272);
        capi.setLocation(404,266);
        capi.setLocation(415,266);
        capi.setLocation(504,92);
        removeObject(comida);
        capi.setLocation(527,105);
        capi.setLocation(439,270);
    }
    
    //public void act() {
      // if (Greenfoot.isKeyDown("r")){
    //        Helado helado = new Helado();
    //   }
}

