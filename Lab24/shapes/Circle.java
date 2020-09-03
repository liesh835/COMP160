package shapes;
import java.awt.*;
/**
 * Circle.java
 * Lab 24
 */

public class Circle extends Shape{
  
  /** method called to draw a random circle with a random colour */
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x,y,width,height);
  }
}