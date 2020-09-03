/**  
 * BoxApp.java
 * Lab 7, COMP160  2019
 * Shaun Liew
 */

public class BoxApp{
  public static void main(String[]args){
    Box box1 = new Box(); // constructor to create the 'box1' object
    
    box1.setHeight(4); //calling mutators on box1
    box1.setLength(4);
    box1.setWidth(6);
    
    Box box2 = new Box(3, 4, 5); // constructor to create the 'box2' object, with input parameters
    
    Box box3 = new Box(5); // constructor to create the 'box3' object, with all sides being equal to 5
    
    Box box4 = new Box(7); // constructor to create the 'box4' object, with all sides being equal to 7
    
    Box.setName("Bob Berry"); //accessing static members of class to retrieve owner's name
           
    System.out.println(box1.toString()); //to call toString method on box1
    System.out.println(box2.toString()); //to call toString method on box2
    System.out.println(box3.toString()); //to call toString method on box3
    System.out.println(box4.toString()); //to call toString method on box4
  }
}