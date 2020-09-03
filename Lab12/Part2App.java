import java.util.Scanner;
/**
 * Part2App.java
 * COMP160 Lab 12 2019
 */

public class Part2App{
  
  /** main method */
  public static void main(String[] args){
    int x = 0; //variable for incrementing the index of the string input
    int vCount = 0; //variable for counting vowels
    int cCount = 0; //variable for counting consonants
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a sentence");
    String line = sc.nextLine();
    System.out.println("The Sentence is: " + line);
    
    while(line.length() > x){
      char ch = line.charAt(x); // variable for locating the char at each index
      if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )
        switch(ch){ 
        case 'a': case 'A':  case 'e':  case 'E':  case 'i': case 'I': case 'o': case 'O': case 'u': case 'U': 
          vCount++;
          break;
        default:
          cCount++;
      }
      x++;
    }
    System.out.println("Vowel Count is: " + vCount);
    System.out.println("Consonant Count is: " + cCount);
  }
}