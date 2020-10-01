
/**************************************************
  *File Name: Assign4quesno1
  *Purpose: to enter the weight or a package and then displays the shipping charges.  
  *Programmer: Sagun Pandey
  *Last Updated Date: 03/31/2016
  *************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
 
 public class Assign4quesno1
 {
   public static void main(String [] args)
   {
     double packageWeight;
     String inputWeight;
     
     inputWeight = JOptionPane.showInputDialog("Enter the weight");
     packageWeight = Double.parseDouble(inputWeight);
     
     if (packageWeight <= 2)
     	JOptionPane.showMessageDialog(null, "Shipping is: $1.10");
     else if (packageWeight <= 6)
     	JOptionPane.showMessageDialog(null, "Shipping is: $2.20");
     else if (packageWeight <= 10)
     	JOptionPane.showMessageDialog(null, "Shipping is: $3.70");
	 else 
     	JOptionPane.showMessageDialog(null, "Shipping is: $3.80");   
   }
 }