/** 
 * Song.java
 * COMP160 2019 Lab 11
 */
public class Song{
  /** data field */
  private String songLine;
  
  /** constructor to set value of songLine */
  public Song(String sLine){
    songLine = sLine;
  }
  
  /** toString method */
  public String toString(){
    return songLine;
  }
  
  /** method process that manipulates aspects of songLine */
  public void process(){
    int token1 = songLine.indexOf(' '); //local variable for first blank space
    int token2 = songLine.indexOf(' ', token1 + 1); //local variable for second blank space
    
    System.out.println("Length: " + songLine.length());
    System.out.println("Last character of songLine: " + songLine.charAt(songLine.length() - 1));
    
    if(token2 != -1){ //avoiding accessing index positions that do not exist
      System.out.println("First two words: " + songLine.substring(0, token2) + "\nRemaining:" + songLine.substring(token2, songLine.length()));
      System.out.println("First letter of third word: " + songLine.charAt(token2 + 1));
    }
    
    System.out.println("songLine in uppercase form: " + songLine.toUpperCase());
    System.out.println("Replacing blank spaces with 'x': " + songLine.replace(' ', 'x'));
    System.out.println("Index value of first 'b': " + songLine.indexOf('b'));
    System.out.println("Checking if value stored in songLine has changed throughout process: " + songLine +"\n");    
  }
}