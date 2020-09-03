package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * ShapePanel.java
 * COMP160 Lab 23
 */

public class ShapePanel extends JPanel{
  /** data fields */
  private Shape [] shapes = new Shape [20];
  private JButton [] shapeButtons = new JButton [7];
  private JLabel countLabel;
  private JTextField showNum;
  private JPanel controlPanel;
  private DrawingPanel drawPanel;
  private Shape shape;
  private int count;
  private Timer timer;
  private final int DELAY = 10;
  
  /** constructor - creating and adding objects */
  public ShapePanel(){
    setLayout(new BorderLayout());
    countLabel = new JLabel("Count");
    showNum = new JTextField(2);
    controlPanel = new JPanel();
    drawPanel = new DrawingPanel();
    shape = new Circle();
    shapeButtons [0] = new JButton ("Circle");
    shapeButtons [1] = new JButton ("Square");
    shapeButtons [2] = new JButton ("Oval");
    shapeButtons [3] = new JButton ("Smiley");
    shapeButtons [4] = new JButton ("Swirl");
    shapeButtons [5] = new JButton ("Start");
    shapeButtons [6] = new JButton ("Stop"); 
    ButtonListener b = new ButtonListener();
    timer = new Timer(DELAY, b);
    setPreferredSize(new Dimension(500, 400)); 
    controlPanel.setPreferredSize(new Dimension(100, 400));
    
    controlPanel.setBackground(Color.gray);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel, BorderLayout.WEST);
    add(drawPanel, BorderLayout.CENTER);  
    
    /** for each loop to add each JButton in array to a listener and the control panel */
    for(JButton jbuttons: shapeButtons){
      jbuttons.addActionListener(b);
      controlPanel.add(jbuttons);       
    }
  }
  
  /** drawing panel - called to draw shapes */
  private class DrawingPanel extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0; i < count; i++){ // to draw shapes
        shapes[i].display(g);
      }
    }
    
    /** constructor to set DrawingPanel size and background */
    public DrawingPanel(){
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.white);
    }
  }
  /** creating events - for adding shapes */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      
      if(e.getSource() == timer){ //calls move method on shapes
        for(int t = 0; t < count; t++){
          shapes[t].move(); 
        }
      }else{
        JButton button = (JButton) e.getSource();
        if(button.getText().equals("Circle")){ //adds a new circle each time Circle is clicked
          if(count < shapes.length){
            shapes[count] = new Circle();
            count++;
          }
        }else if(button.getText().equals("Square")){ //adds a new square each time Square is clicked
          if(count < shapes.length){
            shapes[count] = new Square();
            count++;
          }
        }else if(button.getText().equals("Oval")){ //adds a new oval each time Oval is clicked
          if(count < shapes.length){
            shapes[count] = new Oval();
            count++;
          }
        }else if(button.getText().equals("Smiley")){ //adds a new smiley each time Smiley is clicked
          if(count < shapes.length){
            shapes[count] = new Smiley();
            count++;
          }
        }else if(button.getText().equals("Swirl")){ //adds a new swirl each time Swirl is clicked
          if(count < shapes.length){
            shapes[count] = new Swirl();
            count++;
          }
        }else if(button.getText().equals("Stop")){ // to stop timer
          timer.stop();
        }else if(button.getText().equals("Start")){ //to start timer
          timer.start();
        }
      }
      showNum.setText(Integer.toString(count)); //displays number of shapes
      repaint(); //repaint method
    }
  }
}
