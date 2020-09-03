import java.util.Scanner;
/** 
 * Lab 3, COMP160, 2019
 */

public class Letter{
    private static String yours = "Yours sincerely";
    private static String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
 
    public static void main(String [] args){
      
        // allows user to input name of the successful applicant through name
        String name;  
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the succesful applicant's name");
        name = scan.nextLine();
          
        int junior = 25000;     // standard pay rate for Junior employee
        int intermediate = 35000;  // standard pay rate for Intermediate employee
        int senior = 50000;    // standard pay rate for Senior employee
        
        //executes methods to display each job offer
        jobOffer();
        jobOffer("Executive Producer");
        jobOffer("Actress", senior);
        jobOffer(name , "Chef", intermediate);
        signature();
        
    } // end method
    
    /** displays a job offer for Bottle Washer at $25K */
    public static void jobOffer (){
        System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
        signature();
        
    } // end method
    
    /** displays second job offer with jobTitle */
    public static void jobOffer(String jobTitle){
      System.out.println("Dear applicant\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $25,000 per annum.");
      signature();
        
    } // end method
    
    /** displays third job offer with jobTitle and payRate */
    public static void jobOffer(String jobTitle, int payRate){
      System.out.println("Dear applicant\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + payRate + " per annum.");
      System.out.println(yours + "\n" + sign + "\n");
      signature();
        
    } // end method
    
    /** displays fourth job offer with name, jobTitle and payRate */
     public static void jobOffer(String name, String jobTitle, int payRate){
      System.out.println("Dear " + name + "\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + payRate + " per annum.");
      signature();
        
    } // end method
    
     /** displays signature method */
     public static void signature(){
       System.out.println(yours + "\n" + sign + "\n");
       } // end method
     
} // end class