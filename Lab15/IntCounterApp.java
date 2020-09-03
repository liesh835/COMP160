import java.util.Scanner;
import java.util.Random;
/**
 * IntCounterApp.java
 * Lab 15 2019
 */

public class IntCounterApp{
  /** main method */
  public static void main(String [] args){
    for(int x = 0; x < 3; x++){ // for loop (asking the user 3 times)
      Scanner sc = new Scanner(System.in); //creating scanner
      System.out.println("\nWhich number do you wish to find?");
      int input = sc.nextInt(); 
      IntCounter g1 = new IntCounter(makeArray());
      g1.showTarget(input); //calling the showTarget method
    }
  }
  
  /** makeArray method to create an array of random numbers */
  public static int [] makeArray(){
    Random gen = new Random();
    int rand = (gen.nextInt(6)+5);
    int [] y = new int [rand];
    
    for(int num = 0; num < rand ;num++){ //for loop to fill elements of array with random numbers (0-4) 
      Random gen2 = new Random();
      int rand2 = gen2.nextInt(5);
      y [num] = rand2;
    }
    return y;
  }
}



