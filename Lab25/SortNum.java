import java.util.*;
/** 
 * SortNum.java
 * Lab 25 COMP160
 */

public class SortNum{
  /** data fields */
  private static int [] array = new int [10];
  
  /** main method */
  public static void main (String [] args){
    SortNum sort = new SortNum(); //object for insertion sorting
    sort.randomRange(1, 100);
    System.out.println("Unsorted Array: " + Arrays.toString(sort.array));
    System.out.println("Insertion Sorted Array: " + Arrays.toString(sort.insertArray(array)) + "\n");
    
    SortNum sort2 = new SortNum(); //object for selection sorting
    sort2.randomRange(1, 100);
    System.out.println("Unsorted Array: " + Arrays.toString(sort2.array));
    System.out.println("Selected Sorted Array: " + Arrays.toString(sort2.selectArray(array)));    
  }
  
  /** randomRange method to place random integers (between two numbers) in array */
  public void randomRange(int lo, int hi){
    Random gen = new Random();
    for(int i = 0; i < array.length; i++){
      array[i] = gen.nextInt(hi - lo);
    }
  }
  
  /** method to sort random array of numbers in selection form 
    * selection: takes current element and replaces it with smallest int to the right of element, repeat
    */
  public static int [] selectArray(int [] nums){ 
    int smallIndex, temp, smallValue; //declaring variables
    
    for(int i = 0; i < nums.length ; i++){
      smallIndex = i;
      smallValue = nums [i];
      for(int j = i; j < nums.length; j++){
        if(nums[j] < smallValue){ //if next element is smaller than previous, set next element to smallest - until smallest element in the array is found
          smallIndex = j;
          smallValue = nums [j];
        }
        if(smallValue < nums[i]){ //for swapping elements 
        temp = nums [i];
        nums [i] = nums [smallIndex];
        nums [smallIndex] = temp;
      }
    }   
    }
    return nums;
  }
  
  
  /** method to sort random array of numbers in insertion form 
    * insertion: comparing elements and swapping them to appropriate positions
    */
  public static int [] insertArray(int [] nums){
    int temp = 0;
    
    for(int i = 1; i < nums.length; i++){
      for(int x = i; x > 0; x--){
        if(nums[x] < nums[x - 1]){ //comparing elements in array with the next (+1) and swapping until the order is complete
          temp = nums [x];
          nums [x] = nums [x - 1];
          nums [x - 1] = temp;
        }
      }
    }
    return nums;
  }
}
