
/**************************************************
  *File Name: Question4
  *Purpose: To convert Seconds to time duration
  *Programmer: Sagun Pandey
  *Last Updated Date: 02/25/2016
  *************************************************/
public class Question4 
{
    public static void main(String[] args)
    {
     
     int totalSeconds = 200;
     
     int hours = totalSeconds / 3600;
     int remainder = totalSeconds % 3600;
     
     int minutes = remainder / 60;
     remainder = remainder % 60;
     
     int seconds = remainder;
     System.out.println(+totalSeconds+" seconds is equivalent to "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds.");   
                 
     }
}