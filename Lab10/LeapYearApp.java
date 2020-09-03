/** 
 * LeapYearApp.java
 * COMP160 2019 Lab 10
 */

public class LeapYearApp{
  
  /* main method to call leapYear with parameters */
  public static void main(String [] args){
    leapYear(2018);
    leapYear(2020);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }
  
  /** leapYear method to create process of calculating whether year is a leap year */
  public static void leapYear(int year){
    if(year <= 1582){
      System.out.println(year + ": predates the Gregorian calendar."); 
    }else if(year%4 == 0){
      if(year%100 == 0){
        if(year%400 == 0){
          System.out.println(year + ": is a leap year.");
        }else{
          System.out.println(year + ": is not a leap year.");
        }
      }else{ 
        System.out.println(year + ": is a leap year.");
      }
    }else{
      System.out.println(year + ": is not a leap year.");
    }
  }
}


