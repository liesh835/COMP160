import java.util.Scanner;
/**
 * Fruits.java
 * Lab 16 part 1
 */

public class Fruits{
  
  /** main method */
  public static void main (String [] args){
    String [] fruits = new String [3]; // declaring arrray
    Scanner sc = new Scanner(System.in);   //creating scanner
    Scanner sc2 = new Scanner(System.in);
    
    for(int x = 0; x < 3; x++){ //to get input of a fruit from user
      System.out.println("\nPlease enter a fruit"); 
      String input = sc.nextLine();
      fruits[x] = input;
    }
    
    boolean b = false;
    for(String fr:fruits){ //for user to guess the fruit given first 2 letters 
      
      do{
        String twoLet = fr.substring(0, 2);
        System.out.print("Guess what fruit I am? " + twoLet + "\t" + fr.length() + " letters");
        String input2 = sc2.nextLine();
        
        if(input2.equals(fr)){
          b = true;
        }else{
          System.out.println("Try Again");
          b = false; 
        }
      }while(b != true); //to repeat loop until user is correct
      System.out.println("Correct");
    }
  } 
}


