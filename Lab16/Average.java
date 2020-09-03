/**
 * Average.java
 * Lab 16 Part 3
 */
public class Average{
  
  /** main method */
  public static void main(String [] args){
    
    int [] [] table = {{1,2,3},{4,5,6},{7,8}}; // declaring array
    for(int row = 0; row < table.length; row++){ 
      int sum = 0;
      for(int col = 0; col < table[row].length; col++){
        System.out.print(table[row][col] + " "); //displaying values stored in arrray
       sum += table[row][col];    
      }
      double ave = (double)sum/table[row].length; //calculating average
      System.out.print("\t Average : " + ave);
      System.out.println();
     
    }
  }
}
