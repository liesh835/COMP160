import java.util.Scanner;
/** Customer.java
  * Lab 9 2019
  * Shaun Liew
  */

public class Customer{
  /** data fields */
  private boolean child;
  private boolean student;
  private String name;
  private boolean booked;
  
  /** default constructor replacement */
  public Customer(){}
  
  /** constructor setting values to data fields */
  public Customer(String nameIn, int age, boolean studentIn){
    name = nameIn;
    student = studentIn;    
    child = age >= 5 && age <= 16;
  }
  
  /** accessor for the name of a customer */
  public String getName(){
    return name;
  }
  
  /** accessor for whether a customer is a child */
  public boolean isChild(){
    return child;    
  }
  
   /** accessor for whether a customer is a student */
  public boolean isStudent(){
    return student;
  }
  
  /** mutator for booked customers */
  public void setBooked(){
    booked = true;
  }
  
  /** accessor for if customers are booked */
  public boolean isBooked(){
    return booked;
  }
} // end class
