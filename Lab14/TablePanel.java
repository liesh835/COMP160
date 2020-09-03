import java.awt.*;
import javax.swing.*;
/*
 * TablePanel.java
 * Lab 14 2019
 */

public class TablePanel extends JPanel{
  /** data fields of diner */
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
  /** constructor to create instances of diner */
  public TablePanel(){
    diner1 = new Diner(115, 20, "Yoda", 1);
    diner2 = new Diner(180, 80, "Luke", 2);
    diner3 = new Diner(180, 140, "Han", 3);
    diner4 = new Diner(115, 200, "Darth", 4);
    diner5 = new Diner(50, 140, "Leia", 5);
    diner6 = new Diner(50,80, "Anakin",6);
    setPreferredSize(new Dimension (300, 300)); // to set the dimensions of the window
    setBackground(Color.blue); // to set the background colour
  }
  
  /** paintComponent method to call the draww method on each diner instance and pass Graphics as a parameter */
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.fillRect(110,80,60,110); // to draw the table
  }
}
    
    