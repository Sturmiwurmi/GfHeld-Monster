import greenfoot.*; 
public class MyWorld extends World{
    Kampfsystem kampfsystem = new Kampfsystem(this);
    public MyWorld()
    {  // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(kampfsystem,589,11);       
    }
}
