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
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    String fileName = "LongBadData.txt";
    
    try{ //try statement
      Scanner filescan = new Scanner(new File(fileName));
      while(filescan.hasNextLine() && count < drawObjects.length){ // loops if there is another line in text
        
        boolean fill = true; //declaring local variables
        Color color = Color.white;
        String inputLine = filescan.nextLine();
        
        if(inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){ //if the line matches number of digits expected
          Scanner sc = new Scanner(inputLine);
          
          int rect = sc.nextInt();//setting the code to read the next 6 integers (to gather parameters to create a rectangle)
          int colour = sc.nextInt();
          int x = sc.nextInt();
          int y = sc.nextInt();
          int width = sc.nextInt();
          int height = sc.nextInt();
          
          if(rect == 1){
            fill = true;
          }else{
            fill = false;
          }
          
          if(colour == 1){
            color = Color.red;
          }else if(colour == 2){
            color = Color.blue;
          }else if(colour == 3){
            color = Color.green;
          }   
          drawObjects[count] = new Rectangle(fill, color, x, y, width, height); //creating a rectangle using text data
          count++;
        }
      }
    }catch(FileNotFoundException e){ //catch statement
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