package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * ShapePanel.java
 * COMP160 Lab 21
 */

public class ShapePanel extends JPanel{
  /** data fields */
  private Shape [] shapes = new Shape [20];
  private JButton addShape;
  private JLabel countLabel;
  private JTextField showNum;
  private JPanel controlPanel;
  private DrawingPanel drawPanel;
  private Shape shape;
  private int count;
  
  /** constructor - creating and adding objects */
  public ShapePanel(){
    setLayout(new BorderLayout());
    addShape = new JButton("Add Shape");
    countLabel = new JLabel("Count");
    showNum = new JTextField(2);
    controlPanel = new JPanel();
    drawPanel = new DrawingPanel();
    shape = new Shape();
    ButtonListener b = new ButtonListener();
    setPreferredSize(new Dimension(500, 400)); 
    controlPanel.setPreferredSize(new Dimension(100, 400));
    
    controlPanel.setBackground(Color.gray);
    controlPanel.add(addShape); 
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel, BorderLayout.WEST);
    add(drawPanel, BorderLayout.CENTER);
    addShape.addActionListener(b);      
  }
  
  /** drawing panel - called to draw shapes */
  private class DrawingPanel extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0; i < count; i++){
        shapes[i].display(g);
      }
    }
    
    public DrawingPanel(){
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.white);
    }
  }
  /** creating events - for adding shapes */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==addShape){
        if(count < shapes.length){
          shapes[count] = new Shape();
          count++;
        }
      }
      showNum.setText(Integer.toString(count));
      repaint();
    }
  }
}
