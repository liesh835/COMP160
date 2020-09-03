import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2019 
 */
public class Pie extends JPanel{
  /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
  
  
  /** all drawing code goes in the paint method, which is called automatically*/
  public void paintComponent (Graphics page){
    super.paintComponent(page);
    
    final int X = 50;
    final int Y = 50;
    final int WIDTH = 150;
    final int HEIGHT = 150;
    final int ARC = 45;
    
    page.setColor(Color.blue);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 45, ARC);
    
    page.setColor(Color.pink);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 90, ARC);
    
    page.setColor(Color.cyan);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 135, ARC);
    
    page.setColor(Color.green);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 180, ARC);
    
    page.setColor(Color.orange);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 225, ARC);
    
    page.setColor(Color.yellow);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 270, ARC);
    
    page.setColor(Color.red);
    page.fillArc(X ,Y , WIDTH, HEIGHT, 315, ARC);
    
    page.setColor(Color.gray);
    page.fillArc(X + 10,Y - 5, WIDTH, HEIGHT, 360, ARC);
    
    
    
    
    //your pie chart code goes here
  }
}
