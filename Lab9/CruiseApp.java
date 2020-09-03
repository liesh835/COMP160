import java.text.DecimalFormat;
import java.util.Scanner;
/** application class for Customer.java
  * Lab 9 COMP160
  */

public class CruiseApp{
  
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    
    /** to call confirmBooking method for each customer */
    confirmBooking(customer1); 
    confirmBooking(customer2); 
    confirmBooking(customer3); 
    confirmBooking(customer4); 
    confirmBooking(customer5); 
    confirmBooking(customer6); 
    confirmBooking(customer7); 
    confirmBooking(customer8);
    
    /** to call showBooked method for each customer */
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8);
    
  }
  
  /** method to calculate and display ticket and meal prices for customers */
  public static void confirmBooking(Customer customer){
    DecimalFormat f2 = new DecimalFormat("0.00"); // to set values to 2 decimal places
    double ticket = 56.0;
    double meal = 30.0;
    if (customer.isChild() || customer.isStudent()){
      ticket/=2.0;
    }else{
      ticket*=0.8;
    }
    if(customer.isChild()){
      meal/=2.0;
    }else{
      meal*=0.9;
    }
    double total = meal + ticket;
    
    System.out.println(customer.getName() + "  Ticket Price: $" + f2.format(ticket) + " Meal Price: $" + f2.format(meal) + " Total Price: $" + f2.format(total));
    
    Scanner scan = new Scanner(System.in); // creating scanner class
    System.out.println("Confirm booking for " + customer.getName() + " (Y/N)");
    String book = scan.nextLine();
    if(book.equals("Y") || book.equals("y")){
      customer.setBooked(); 
      System.out.println("Booked");
    }
    if(book.equals("N") || book.equals("n")){
      System.out.println("Not Booked");
    }
  }
  
  /** method to display booked customers */
  public static void showBooked(Customer customer){
    if (customer.isBooked() == true){
      System.out.println(customer.getName() + " is booked"); 
    }     
  }
}