/**************************************************
  *File Name: Assign06quesno1
  *Purpose: To stimulate coin tossing     
  *Programmer: Sagun Pandey
  *Last Updated Date: 05/08/2016
  *************************************************/
import java.util.Scanner;

public class Assign06ques1
{
   public static boolean flip()
   {
   String[] choices = {"1","2"};
   int length = choices.length;
   int random1 = (int) (Math.random()*length);
   boolean result = false; 
   String num = choices[random1];
   if(num == "1") 
   {
   result = true; 
   }
   return result;
   }
   
   public static void main(String[] args)
   {
   int input = 0;
   while (input != -1)
   {
   System.out.println("Enter the number of times you want to toss or enter -1 to quit:");
   Scanner scanner = new Scanner(System.in);
   input=scanner.nextInt();
   System.out.println();

   int count_heads = 0;
   int count_tails = 0;
   for (int i=0; i< input; i++) 
   {
   if(flip())
   count_heads++;
   else
   count_tails++;
   }
   if(input > 0)
   System.out.println(count_heads + " Heads " + count_tails + " Tails ");
   System.out.println();

   }
   return;
   }

}