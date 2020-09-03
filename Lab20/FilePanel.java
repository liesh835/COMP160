import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
/** FilePanel.java
  * Lab 20, COMP160,  2019
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30); //creates rectangle object
    count++; // increments count
    drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30); //create rectange object
    count++; // increments count
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    String fileName = "Lab20data.txt";
    
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      while(fileScan.hasNextLine()){
        
        int rect = fileScan.nextInt();
        int colr = fileScan.nextInt();
        int x = fileScan.nextInt();
        int y = fileScan.nextInt();
        int width = fileScan.nextInt();
        int height = fileScan.nextInt();
        System.out.println(rect);
        
        
      }
    }catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location.");
      System.exit(1);
    }
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
      
    } 
  }
}
