
/**************************************************
  *File Name: Question5
  *Purpose: To find value of sine,cosine and sum
  *Programmer: Sagun Pandey
  *Last Updated Date: 02/25/2016
  *************************************************/
public class Question5 
{

    public static void main(String[] args)
    {
       
       double value = 0.5236;
      
         double sinx = Math.sin(value);
        double cosx = Math.cos(value);
        double sum = Math.pow(sinx,2) + Math.pow(cosx,2);
        
      System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: "+sum);
         
        
    }
    
}
