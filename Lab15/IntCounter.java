import java.util.Scanner;
import java.util.Random;
/**
 * IntCounter.java
 * Lab 15 2019
 */

public class IntCounter{
  /** data field */
  private int[]numArray = new int [10];
  
  /** constructor to set data fields and crete a foreach loop that displays elements of the array */
  public IntCounter(int[]numArray){
    this.numArray = numArray;
    for(int x:numArray){ //foreach loop
      System.out.print(x + " ");
    }
    System.out.print("Array is of length " + numArray.length + "\n");
  }
  
  /** show target method which displays the target index number found in the array */
  public void showTarget(int target){
    
    for(int i = 0; i < numArray.length; i++){
      if(numArray[i] == target){
        
        System.out.println("\nThere is a " + target + " in position " + i);
      }
    }
    
  }
}
