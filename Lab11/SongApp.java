/** 
 * SongApp.java
 * COMP160 2019 Lab 11
 */

public class SongApp{
  
  /** main method */
  public static void main(String [] args){
    /** creating new instances of Song */
    Song song1 = new Song("While my guitar gently weeps");
    Song song2 = new Song("Let it be");
    Song song3= new Song("Help");
    
    /** calling methods on toString in the support class */
    song1.toString();
    System.out.println(song1.toString());
    song1.process();
    song2.toString();
    System.out.println(song2.toString());
    song2.process();
    song3.toString();
    System.out.println(song3);
    song3.process();   
  }
}