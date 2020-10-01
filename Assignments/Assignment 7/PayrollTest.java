/**************************************************************************************************
  *File Name:PayrollTest 
  *Purpose: To find the gross pay rate of the Employee.  
  *Programmer:Sagun Pandey 
  *Last Updated Date:5/19/2016
 ***************************************************************************************************/
import java.util.Scanner;	

public class PayrollTest
{
	public static void main(String[] args)
	{
		String EmployeeName;
		int IDnumber;
		double HoursWorked;
		double HourlyPayRate;
		double GrossPay;
      
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please enter the employee's name: ");
		EmployeeName = keyboard.nextLine();
		
		
		System.out.println("Please enter the employee's ID no. : " );
		IDnumber = keyboard.nextInt();
		
		
		System.out.println("Enter the amount of hours worked by employee: ");
		HoursWorked = keyboard.nextDouble();
		
		
		System.out.println("Enter the hourly pay rate:");
		HourlyPayRate = keyboard.nextDouble();
      
      
      
      Payroll pay = new Payroll(EmployeeName, IDnumber);
      pay.setHoursWorked(HoursWorked);
      pay.setHourlyPayRate(HourlyPayRate);
		
		System.out.println("The gross pay of " + EmployeeName + " is  $" + pay.getGrossPay());
	}
}
