import javax.swing.*;
import java.awt.*;
/**  
 * MyPanelApp.java
 * Lab 6, COMP160 2019
 * Shaun Liew 2019
 */

public class MyPanelApp{
  public static void main(String[]args){
    MyPanel mp1 = new MyPanel();
    mp1.decorate(Color.blue, 180);
    
    MyPanel mp2 = new MyPanel();
    mp2.decorate(Color.green, 90);
  }
}
