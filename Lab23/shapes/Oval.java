package shapes;
import java.awt.*;
/**
 * Oval.java
 * Lab 23 
 */

public class Oval extends Shape{
  
  /** constructor that changes value of height and y */
  public Oval(){
    height = 4 * width;
    y = randomRange(0, (400 - height));
  }
                    
  /** method called to draw a random oval with a random colour */
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x,y,width,height);
  }
}