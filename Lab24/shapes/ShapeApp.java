package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * ShapeApp.java
 * Lab 24
 */

public class ShapeApp{
  
   /** main method to create JFrame and calls its methods */
   public static void main (String [] args){
    JFrame frame = new JFrame ("ShapePanel");
    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
  }
}