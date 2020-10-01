
/**************************************************
  *File Name: Assign4quesno2
  *Purpose: to display the total charge.  
  *Programmer: Sagun Pandey
  *Last Updated Date: 03/31/2016
  *************************************************/
import java.util.Scanner;

public class Assign4quesno2
{
 public static void main(String[] args)
 {
    System.out.println("Enter the package that you purchased:(A,B or C) ");
    Scanner keyboard=new Scanner(System.in);
    char pack=keyboard.nextLine().charAt(0);
    
    System.out.println("Enter number of hours you Used:");
    int hours= keyboard.nextInt();
    
  
    int extrahours;
    double extrahoursfees;
    double total;
    
    
     
    switch(pack)
    {
     case 'A':
     if (hours<=10)
     {
      System.out.println("Your total internet charge is $9.95");
      } 
     else
     {       
      extrahours=hours-10;
      extrahoursfees=extrahours*2.00;
      total=9.95 + extrahoursfees;
      System.out.println("Your total internet charge is $"+total);
     }
      break;
      case 'B':
      if (hours<=20)
       {
        System.out.println("Your total interent charge is $13.95");
        }
       else
     {  
      
      
      extrahours=hours-20;
      extrahoursfees=extrahours*1.00;
      total=13.95+extrahoursfees;
      System.out.println("Your total internet charge is $"+total);
     }
      break;
      
      case 'C':
      System.out.println("Your total internet bill is $"+19.95);
      break;
      
      default:
      System.out.println("Enter valid package.");
      }
      
     
          
    
      
   
  }
 }