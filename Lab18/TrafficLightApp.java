import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/** 
 * TrafficLightApp.java
 * Lab 18 2019
 */

public class TrafficLightApp{
  
  /** main method to create JFrame and calls its methods */
  public static void main (String [] args){
    JFrame frame = new JFrame ("Traffic Light");
    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TrafficLightPanel());
    frame.pack();
    frame.setVisible(true);
  }
}