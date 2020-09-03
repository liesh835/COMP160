import java.awt.*;
import javax.swing.*;
/*
 * SeatingPlan.java
 * Lab 14 2019
 */
public class SeatingPlan{
  
  /** main method to create JFrame and calls its methods */
  public static void main (String [] args){
    JFrame frame = new JFrame ("Seating Plan");
    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TablePanel());
    frame.pack();
    frame.setVisible(true);
  }
}