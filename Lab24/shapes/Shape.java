package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
/**
 * Shape.java
 * Lab 24
 */

public abstract class Shape{
  
  /** data fields */
  protected int x, y, width, height, moveX, moveY;
  protected Color colour;
  
  /** constructor initializing data fields */
  public Shape(){
    this.width = randomRange(10, 30);
    this.height = width;
    this.x = randomRange(0, (400 - width));
    this.y = randomRange(0, (400 - height));
    int r = randomRange(0, 255);
    int g = randomRange(0, 255);
    int b = randomRange(0, 255);
    this.moveX = 1;
    this.moveY = 1;
    Color randCol = new Color(r, g, b);
    this.colour = randCol;
  }
  
  /** to create an object of Random type */
  public int randomRange(int lo, int hi){
    Random gen = new Random();
    return gen.nextInt(hi-lo+1) + lo;
  }
  
  /** move method */
  public void move(){
    
    if(x <= 0 || x >= (400 - width)){
      moveX = moveX * -1;
      x += moveX;
    }else{ 
      x += moveX; // increments x - causing position of shape to move (left/right) relative to x based on the timer 
    }
    if(y <= 0 || y >= (400 - height)){
      moveY = moveY * -1;
      y += moveY;
    }else{
      y += moveY; // increments y - causing position of shape to move (upwards/downwards) relative to y based on the timer
    } 
  }
  
  /** showIndex method to show the index number of shape in array */
  public void showIndex(Graphics g, int in){
    g.setColor(Color.black);
    g.drawString(Integer.toString(in), x, y);
  }
  /** abstract method for display */
  public abstract void display(Graphics g);  
}

