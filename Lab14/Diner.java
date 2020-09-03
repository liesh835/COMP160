import java.awt.*;
import javax.swing.*;
/*
 * Diner.java
 * Lab 14 2019
 */

public class Diner{
  /**data fields */
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int DIAMETER = 50;
  
  
  /** constructor to set values to the data fields */
  public Diner(int x, int y, String name, int seatNum){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    if(seatNum % 2 == 0){ // to set colour of seats to gray if even and white if odd
      this.colour = Color.gray;
    }else{ 
      this.colour = Color.white;
    }
  }
  
  /** draw method to create the seats and names */
  public void draw (Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, DIAMETER, DIAMETER);
    g.setColor(Color.black);
    Font boldH14 = new Font ("Helvetica", Font.BOLD, 14); //editing font for drawString method
    g.drawString(name, x + 10, y + 25); //drawString for names
    g.drawString(Integer.toString(seatNum), x + 20, y + 10); //drawString for seat number
    
  }
}