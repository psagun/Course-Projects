/**************************************************
  *File Name: Assign5quesno2
  *Purpose: to read twelve temperature values(one for each month) and display the highest 
            temperature and the number of the month with the highest temperature.    
  *Programmer: Sagun Pandey
  *Last Updated Date: 04/14/2016
  *************************************************/
  import java.util.Scanner;

public class Assign5quesno2
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
       
     
     double temp=0;
     double curMax = temp;
      int hmonth=0;
     int month;
     for( month=1;month<=12;month++)
     {
      System.out.println("Enter a "+month+"'s month temperature Value in degree Celsius:");
      temp=keyboard.nextDouble();
      
       if(temp>curMax)
             curMax = temp;
       if(curMax==temp)
              hmonth=month;      
             
           
      }
      
                       
          
    
   
   System.out.println("The highest temperature is "+ curMax+" degrees Celsius of the "+hmonth+"'s Month. ");
           
       
       }
       
      
      
}       
   