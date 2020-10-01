/**************************************************
  *File Name: Question1
  *Purpose: To compute the tax and tip on a restaurant bill
  *Programmer: Sagun Pandey
  *Last Updated Date: 03/08/2016
  *************************************************/
    import java.util.Scanner;
 public class RestaurantBill
 {
   public static void main(String[] args)
 	{
 		double charge;
 		double tax = 0.0625;
 		double tipRate = 0.15;
 		double totalWithTax;
 		double taxAmount;
 		double tipAmount;
 		double grandTotal;
 		
 		Scanner keyboard = new Scanner(System.in);
 		
 		System.out.println("What is the charge for your meal?");
 		charge = keyboard.nextDouble();
 		
 		taxAmount = charge * tax;
 		totalWithTax = charge + taxAmount;
 		tipAmount = totalWithTax * tipRate;
 		grandTotal = totalWithTax + tipAmount;
 		
 		System.out.println("meal: $" + charge);
 		System.out.println("tax: $" + taxAmount);
 		System.out.println("meal + tax: $" + totalWithTax);
 		System.out.println("total cost(tip included): $" + grandTotal);
 		
 			
 	}
 }