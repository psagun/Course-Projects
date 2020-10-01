/**************************************************
  *File Name: Assign5quesno1
  *Purpose: loop program to compute the sum of different numbers. 
  *Programmer: Sagun Pandey
  *Last Updated Date: 04/14/2016
  *************************************************/
import java.util.Scanner;

public class Assign5quesno1
{
   public static void main(String[] args)
   {
       int total = 0; 
   int num;
   for( num = 0; num<=100; num+=2)
  {
       total += num;
       
       }
        System.out.println("The sum of all even numbers between 2 and 100 is "+total+".");
        System.out.println();
         
   
   
   
    total = 0; 
    for( num = 1; num<=100; num++)
  {
       total += Math.pow(num,2);
   }    
        System.out.println("The sum of all squares between 1 and 100 is "+total+".");
         System.out.println();
        
      
      
      
       total = 0;  
      for( num = 0; num<=20; num++)
  {
      total = (int)Math.pow(2,num);
       
       
        System.out.println(" 2^"+num+"= "+total);
         
       
   } 
         
         
         
         total = 0; 
         for( num = 1; num<=100; num+=2)
  {
       total += num;
       
       }
         System.out.println();
         System.out.println("The sum of all odd numbers between 2 and 100 is "+total+".");
       
     }
     
}        