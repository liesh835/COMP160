/**  
 * Box.java
 * Lab 7, COMP160  2019
 * Shaun Liew
 */

public class Box{
  /** data fields */
  private int height;
  private int width;
  private int length;
  private static String owner; //static data field for owner
  
  /** mutator for height */
  public void setHeight(int h){ 
    height = h;
  }
  
  /** mutator for width */
  public void setWidth(int w){ 
    width = w;
  }
  
  /** mutator for length */
  public void setLength(int l){ 
    length = l;
  }
  
  /** static mutator for owner's name */
  public static void setName(String o){
    owner = o;
  }
  
  /** static accessor for owner's name */
  public static String getName(){ 
    return owner;
  }
  
  /** accessor for surface area */
  public int getSurfaceArea(){ 
    return (height * length * 2) + (height * width * 2) + (width * length *2);
  }
  
  /** accessor for volume */
  public int getVolume(){ 
    return height * length * width; 
  }
  
  /** toString method */
  public String toString(){ 
    return "The height is : " + height + ",\nThe length is : " + length + ",\nThe width is : " + width + ",\nThe volume is : " + getVolume() + 
      ",\nThe surface area is : " + getSurfaceArea() + ".\nOwned by " + owner +".\n";
  }
  
  /** constructor taking three parameters */
  public Box(int h, int w, int l){ 
    height = h;
    width = w;
    length = l;
  }
  
  /** default constructor replacement */
  public Box(){} 
  
  /** constructor for if box was cube - all sides are equal */
  public Box(int side){ 
    height = side;
    length = side;
    width = side;
  }
  
} // end class




