/*
5. Write program to input number and check number is perfect or not? 
*/
import java.util.*;
  public class PerfectNo{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner (System.in);
       System.out.println("Enter  number :");
         int no=sc.nextInt();
         int sum=0;
         for(int i=1;i<no;i++)
         {
           if(no%i==0)
           {
            sum=sum+i;
            System.out.print("\t"+sum);
           }
         }
        String s=(sum==no)? "Perfect":"Not Perfect";
         System.out.println(s); 
        
    }
  }