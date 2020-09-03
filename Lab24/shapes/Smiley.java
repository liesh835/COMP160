package shapes;
import java.awt.*;
/**
 * Smiley.java
 * Lab 24 
 */

public class Smiley extends Shape{
  public Smiley(){
    height = 30;
    width = 30;
    y = randomRange(0, (400 - height));
    x = randomRange(0, (400 - width));
  }
  
  /** method called to draw a smiley */
  public void display(Graphics g){
    g.setColor(Color.yellow);
    g.fillOval(x,y,width,height);
    g.setColor(Color.black);
    g.drawOval(x,y,width,height);
    g.fillOval(x + 7, y + 8, 4, 4);
    g.fillOval(x + 20, y + 8, 4, 4);
    if(super.moveY == -1){ // smiling when travelling upwards, frowning when travelling downwards
      g.drawArc(x + 8, y + 10, 15, 13, 190, 160);
    }else{
      g.drawArc(x + 8, y + 15, 15 , 13, 0, 180);
    }
  }
}