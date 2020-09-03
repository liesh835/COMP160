import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
/**
 * TrafficLightPanel.java
 * Lab 18 2019
 */

public class TrafficLightPanel extends JPanel{
  /** data fields */
  private JButton redButton, amberButton, greenButton;
  private JLabel lastPressedLabel;
  private JPanel buttonPanel;
  
  /** constructor */
  public TrafficLightPanel(){
    redButton = new JButton("Red"); //instantiates data feilds
    amberButton = new JButton("Amber");
    greenButton = new JButton("Green");
    lastPressedLabel = new JLabel("last pressed");
    buttonPanel = new JPanel();
    ButtonListener b = new ButtonListener();
    LightPanel l = new LightPanel();
    setBackground(Color.blue); //sets background colour
    setPreferredSize(new Dimension(200, 300)); //sets preferred size of panel
    buttonPanel.setPreferredSize(new Dimension(80, 290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(redButton); // adds button to buttonPanel
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    add(buttonPanel);
    redButton.addActionListener(b); // adds ActionListener to each button
    amberButton.addActionListener(b);
    greenButton.addActionListener(b);
    add(l); // adds LightPanel
  }
  
  /** inner private class */
  private class LightPanel extends JPanel{
    /** paintComponent method to draw objects */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      g.fillOval(20, 30, 40, 40); //draws circle
      g.fillOval(20, 80, 40, 40);
      g.fillOval(20, 130, 40, 40);
      lastPressedLabel.getText(); //getText method to retrieve text field
      
      /** if statement to draw new circles based on getText() method */
      if(lastPressedLabel.getText() == "red"){
        g.setColor(Color.red);
        g.fillOval(20, 30, 40, 40);
      }else if(lastPressedLabel.getText() == "amber"){
        g.setColor(Color.orange);
        g.fillOval(20, 80, 40, 40);
      }else if(lastPressedLabel.getText() == "green"){
        g.setColor(Color.green);
        g.fillOval(20, 130, 40, 40);
      }
    }
    
    /** constructor that sets background and preferred size of panel */
    public LightPanel(){
      setPreferredSize(new Dimension(80, 290));
      setBackground(Color.cyan);
    }
  }
  /** inner class  to create events*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == redButton){ // if statement to change the text of label and colour if button is pressed
        lastPressedLabel.setText("red"); 
        buttonPanel.setBackground(Color.red);
      }else if(e.getSource() == amberButton){
        lastPressedLabel.setText("amber");
        buttonPanel.setBackground(Color.orange);
      }else if(e.getSource() == greenButton){
        lastPressedLabel.setText("green");
        buttonPanel.setBackground(Color.green);
      }
      repaint();
    } //to refresh panel
  }
}