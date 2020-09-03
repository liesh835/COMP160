import java.util.Scanner;
/**
 * ProjectApp.java
 * COMP160 Lab 12 2019
 */

public class ProjectApp{
  
  /** main method */
  public static void main(String[] args){
    int sum = 0; // local variable for sum of even numbers
    int i = 0; // local variable that ensures loop stays within input data
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter an integer greater than 1");
    int input = sc.nextInt();
    
    if(input < 2){
      System.out.println("Input value must not be less than 2");
    }else{
      while(input >= 2 && i < input){
        i+=2;
        sum += i;
      }
      System.out.println("Sum of even numbers between 2 and " + input + " inclusive is: " + sum);
    } 
  }   
}
