/*
6. Write program to input number and check number is duck or not? 
*/
import java.util.*;
  public class DuckNumber{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner (System.in);
       System.out.println("Enter  number :");
         int no=sc.nextInt();
         int f=0,rem=0;
        while(no!=0)
        {
         rem=no%10;
         if(rem==0)
         {
          f=1;
          break;
         }
         no=no/10;
        }
        String s=(f==1)? "DuckNumber":"Not Duck";
         System.out.println(s); 
        
    }
  }