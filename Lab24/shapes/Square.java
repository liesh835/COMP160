package shapes;
import java.awt.*;
/**
 * Square.java
 * Lab 24
 */

public class Square extends Shape{
  
  /** method called to draw a random square with a random colour */
  public void display(Graphics g){
    g.setColor(colour);
    g.fillRect(x,y,width,height);
  }
}