import java.text.DecimalFormat;
/**  
 * TriangleApp.java
 * Lab 8, COMP160  2019
 * Shaun Liew
 */

public class TriangleApp{
  public static void main(String[]args){
    
    /** object to limit a value to 2 decimal places */
    DecimalFormat f2 = new DecimalFormat("0.##");
    
    /** default constructor */
    Triangle test = new Triangle();
    
    /** constructor for Triangle a */
    Triangle a = new Triangle(0,3,3,4,1,9,"A");
    
    /** constructor for Triangle b */
    Triangle b = new Triangle(4,2,9,4,6,7,"B");
    
    /** to display name and perimeter of each triangle to two decimal places */
    System.out.println("Triangle " + test.getName() + "'s perimeter is " + f2.format(test.getPerimeter()) + " units.");
    System.out.println("Triangle " + a.getName() + "'s perimeter is " + f2.format(a.getPerimeter()) + " units.");
    System.out.println("Triangle " + b.getName() + "'s perimeter is " + f2.format(b.getPerimeter()) + " units.");
  }
} //end method