import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
    
    private void prepare()
    {
        Bear bear = new Bear();
        addObject(bear,100,100);
        
        Turtle turtle = new Turtle();
        addObject(turtle,500,300);
    }
}
