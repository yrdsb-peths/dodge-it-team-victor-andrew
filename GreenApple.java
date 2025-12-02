import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenApple extends Actor
{
    /**
     * Act - do whatever the GreenApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenApple() {
        setImage("images/apple2.png");
    }
    
    public void act()
    {
        // Add your action code here.
      move(-5);
        
        if(getX() <= 0) {
            resetGreenApple();
        }
        
        if(isTouching(Hero.class)){
            getWorld().removeObject(this);
        }
    }
        public void resetGreenApple() {
            int num = Greenfoot.getRandomNumber(2);
            if(num == 0) {
                setLocation(600, 100);
            } else {
                setLocation(600, 300);
                }
    }
}
