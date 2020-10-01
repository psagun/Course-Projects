
/**************************************************
  *File Name: Question3
  *Purpose: To calculate the value of the discount
  *Programmer: Sagun Pandey
  *Last Updated Date: 03/08/2016
  *************************************************/
import java.util.Scanner;
public class Movies
{
   public static void main(String[] args)
   {
   
      int movieRentals;
      int noOfMembers;
      double amount;
      double discount;
            	
       Scanner keyboard = new Scanner(System.in);
 		
 		System.out.println("Enter the movie rentals ");
      movieRentals = keyboard.nextInt();
      System.out.println("Enter the numbers of members referred to the video club ");
      noOfMembers= keyboard.nextInt();
            
            amount= movieRentals+noOfMembers;
            discount = Math.min(amount,75);    
            
                     		
 	      System.out.println("The disocunt is equal to "+ discount + "%");
         
     }
}        