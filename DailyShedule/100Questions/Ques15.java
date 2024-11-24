/*Write a C program to input principle (amount), time and rate (P, T, R) and find Compound Interest. How to calculate compound interest in C programming. Logic to calculate compound interest in C program.
Example
Input
Enter principle (amount): 1200
Enter time: 2
Enter rate: 5.4
*/
import java.util.*;
class Ques15
{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter principle amount");
     int p=sc.nextInt();
      System.out.println("Enter rate");
       float r=sc.nextFloat();
           System.out.println("Enter time");
            int t=sc.nextInt();
            //compound interest logic
         double ci=p*Math.pow(1+(r/100),t);
          System.out.println("Compound interest:"+ci);
          
  }
}