/**************************************************************************************************
  *File Name:Payroll 
  *Purpose: To find the gross pay rate of the Employee.  
  *Programmer: Sagun Pandey 
  *Last Updated Date:5/19/2016
 ***************************************************************************************************/
import java.util.Scanner;	

public class Payroll
{
	private String EmployeeName;
	private int IDnumber;
	private double HourlyPayRate;
	private double HoursWorked;
	private double GrossPay;
	
	
	public Payroll(String Name, int ID)
	{
		EmployeeName = Name;
		IDnumber = ID;
	}
	public String getEmployeeName()
	{
		return EmployeeName;
	}
	public int getIDnumber()
	{
		return IDnumber;
	}
	public void setHourlyPayRate(double HourlyRate)
	{
		HourlyPayRate = HourlyRate;
	}
	public double getHourlyPayRate()
	{
		return HourlyPayRate;
	}
	public void setHoursWorked(double hoursWorked)
	{
		HoursWorked = hoursWorked;
	}
	public double getHoursWorked()
	{
		return HoursWorked;
      
	}
   	public double getGrossPay()
	{
		return HourlyPayRate * HoursWorked;
	}
}
