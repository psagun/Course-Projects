/**************************************************
  *File Name: Assign06quesno2
  *Purpose: To let the user play the game of Rock, Paper, and Scissors against the computer.  
  *Programmer: Sagun Pandey
  *Last Updated Date: 05/08/2016
  *************************************************/
  import java.util.*;
  
  public class Assign06quesno2
{

 public static void main(String[] args)
 {
   int computer=comChoice();
   String player=playerChoice();
   
   String choose=" ";
  if(computer==1)
  {
   choose="Rock";
  }
  if(computer==2)
  {
   choose="Paper";
  }
  if(computer==3)
  {
   choose="Scissor";
  }

   
  System.out.println("Computer choosed : "+choose);
  System.out.println("But YOU(Player) choosed: "+player);
  Winner(choose,player);
  
   
        
   
  
   
 }
 
 public static int comChoice()
 {
  Random rand=new Random();
  int num=rand.nextInt(3)+1;
  int choice=num;
  return choice; 
  }
  
  public static String playerChoice()
  {
  
   Scanner keyboard=new Scanner(System.in);
   System.out.println("\nEnter Rock,Paper or Scissor:");
   String choice=keyboard.nextLine();
   
  while(!(choice.equalsIgnoreCase("rock")) && !(choice.equalsIgnoreCase("paper")) && !(choice.equalsIgnoreCase("Scissor"))) 
  {
   System.out.print("INVALID USER INPUT!! ");
   choice = keyboard.nextLine();
  }
   
   return choice;
  }
 
    
  public static void Winner(String choose,String player)
  {
   if (choose.equalsIgnoreCase("rock") && player.equalsIgnoreCase("paper"))
          System.out.println("\nPaper wraps rock.\nSo, YOU WIN THE GAME!!!!");
   else if(choose.equalsIgnoreCase("rock") && player.equalsIgnoreCase("scissor"))
          System.out.println("\nRock smashes scissor.\nSo, the computer WINS!");
   else if (choose.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("Rock"))
          System.out.println("\nPaper wraps rock.\nSo, the computer WINS!");
   else if(choose.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("scissor"))
          System.out.println("\nScissor cuts Paper.\nSo, YOU WIN THE GAME!!!");
   else if (choose.equalsIgnoreCase("Scissor") && player.equalsIgnoreCase("Rock"))
          System.out.println("\nRock smashes scissors.\nSo, YOU WIN THE GAME!!!");
   else if(choose.equalsIgnoreCase("Scissor") && player.equalsIgnoreCase("paper"))
          System.out.println("\nScissor cuts paper.\nSo,the computer WINS!!!");
   else if(choose.equalsIgnoreCase(player))
           System.out.println("\nThe game is Tied!!!! Please Play again!!");
             
                                      
  }       
   

}
