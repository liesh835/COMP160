import java.util.Scanner;
/**
 * Anagram.java
 * COMP160 Lab 13 2019
 */

public class Anagram{
  
  /** main method */
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);  //new scanner object 1
    System.out.println("Enter first phrase");
    String phrase1 = sc.nextLine();
    
    Scanner sc2 = new Scanner(System.in); // new scanner object 2
    System.out.println("Enter second phrase");
    String phrase2 = sc2.nextLine();
  
    System.out.println(getMethod(phrase1) + " are the letters of " + phrase1 + " in order.");
    System.out.println(getMethod(phrase2) + " are the letters of " + phrase2 + " in order.");
    
    /** if statement that prints a statement depending on whether 2 strings are anagrams or not */
    if(getMethod(phrase1).equals((getMethod(phrase2)))){
    System.out.println(phrase1 + " is an anagram of " + phrase2);
    }else{
      System.out.println(phrase1 + " is not an anagram of " + phrase2);
    }
  }
  
  /** method which rearranges the input phrase in alphebetical order and in lower case */
  public static String getMethod(String phrase){
    phrase = phrase.toLowerCase();
    String empty1 = "";
    
    for(char ch = 'a'; ch <= 'z'; ch++){ //looping each lower case letter in the alphabet
      for(int x = 0; x < phrase.length(); x++){ //looping each index of the phrase
        if(phrase.charAt(x) == ch){ //adds to the new string when found a match
          empty1 += ch;
        }
      }
    }
    return empty1; //returns phrase in lower case and alphebetical order
  }
} //end class


