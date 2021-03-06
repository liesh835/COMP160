package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
/**
 * Shape.java
 * Lab 21
 */

public class Shape{
  /** data fields */
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  /** constructor initializing data fields */
  public Shape(){
    this.width = randomRange(10, 30);
    this.height = width;
    this.x = randomRange(0, (400 - width));
    this.y = randomRange(0, (400 - height));
    int r = randomRange(0, 255);
    int g = randomRange(0, 255);
    int b = randomRange(0, 255);
    Color randCol = new Color(r, g, b);
    this.colour = randCol;
  }
  
  /** to create an object of Random type */
  public int randomRange(int lo, int hi){
    Random gen = new Random();
    return gen.nextInt(hi-lo+1) + lo;
  }
  
  /** method called to draw a random circle with a random colour */
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x,y,width,height);
  }
}