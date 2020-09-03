package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * ShapePanel.java
 * COMP160 Lab 22
 */

public class ShapePanel extends JPanel{
  /** data fields */
  private Shape [] shapes = new Shape [20];
  private JButton addShape, start, stop;
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
    addShape = new JButton("Add Shape");
    start = new JButton("Start");
    stop = new JButton("Stop");
    countLabel = new JLabel("Count");
    showNum = new JTextField(2);
    controlPanel = new JPanel();
    drawPanel = new DrawingPanel();
    shape = new Shape();
    ButtonListener b = new ButtonListener();
    timer = new Timer(DELAY, b);
    setPreferredSize(new Dimension(500, 400)); 
    controlPanel.setPreferredSize(new Dimension(100, 400));
    
    controlPanel.setBackground(Color.gray);
    controlPanel.add(addShape); 
    controlPanel.add(start);
    controlPanel.add(stop);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel, BorderLayout.WEST);
    add(drawPanel, BorderLayout.CENTER);
    addShape.addActionListener(b);
    start.addActionListener(b);
    stop.addActionListener(b);
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
      
      if(e.getSource() == stop){ // to stop timer
        timer.stop();
      }else if(e.getSource() == start){ //to start timer
        timer.start();
      }
      
      if(e.getSource() == timer){ //calls move method on shapes
        for(int t = 0; t < count; t++){
          shapes[t].move(); 
        }
      }else if(e.getSource() == addShape){ //adds a new shape each time addShape is clicked
        if(count < shapes.length){
          shapes[count] = new Shape();
          count++;
        }
      }
      showNum.setText(Integer.toString(count)); //displays number of shapes
      repaint(); //repaint method
    }
  }
}
