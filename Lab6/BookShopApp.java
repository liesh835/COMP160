import java.text.NumberFormat;
/**  
 * BookShopApp.java
 * Lab 6, COMP160 2019
 * Shaun Liew 2019
 */

public class BookShopApp{
  public static void main(String[]args){
    Book book1 = new Book();
    book1.setTitle("Life of Pi");
    book1.setPages(348);
    book1.setPrice(28.90);
    book1.displayBook();
    
    
    Book book2 = new Book();
    book2.setTitle("Master Pip");
    book2.setPages(240);
    book2.setPrice(22.70);
    book2.displayBook();
    
    Book book3 = new Book();
    book3.setTitle("Java for Dummies");
    book3.setPages(160);
    book3.setPrice(13.30);
    book3.displayBook();
    
  }
}