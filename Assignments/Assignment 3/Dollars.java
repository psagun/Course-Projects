
/**************************************************
  *File Name: Question2
  *Purpose: To extract the dollars and cents from a price given as a double floating-point value
  *Programmer: Sagun Pandey
  *Last Updated Date: 03/08/2016
  *************************************************/
import java.util.Scanner;
public class Dollars
{
   public static void main(String[] args)
   {
   
      double price;
      Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter any number ");

      
      price= keyboard.nextDouble();
       int dollars = (int)price;
      
      double result = (price - dollars)*100 + 0.5;
      int cents = (int)result;
      
     
     System.out.println("Dollars is " + dollars + " and Cents is " + cents);
     
    }
}     
     
      
   
   