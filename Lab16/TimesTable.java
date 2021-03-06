/**
 * TimesTable.java
 * Lab 16 Part 2
 */

public class TimesTable{
  
  /** main method to create 12 times table*/
  public static void main (String [] args){
    int [] [] timesTable = new int [12][12]; //declaring 2D array
    for(int row = 0; row < 12; row++){ //to store/create each value for the times table
      for(int col = 0; col < 12; col++){
        timesTable[row][col] = (row + 1) * (col + 1);
      }
    }
    for(int [] r : timesTable){ // to display values
      for(int c : r){
      System.out.print(c + "\t");
      }
      System.out.println();
    }
  }
}