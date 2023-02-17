import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Random;

public class Turtle extends Actor
{
    
    private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset = 5;
    private int counterAddObject;
    
    public Turtle(){
        offsetX = nextOffset;
        offsetY = nextOffset;
        
        if(nextOffset > 5){
        nextOffset -= 3;
        }
    }
    

    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x - offsetX, y - offsetY);
        
        if(isAtEdge()){
            offsetY *= -1;
        }
        
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
    }
}
