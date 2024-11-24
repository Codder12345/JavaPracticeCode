/*
7. Write a program to input number and check number is palindrome or not? 
*/
import java.util.*;
   public class Palindrom{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
            int no=sc.nextInt();
           int rem=0,rev=0;
           int temp=no;
          while(no!=0)
          {
           rem=no%10;
           rev=rev*10+rem;
           no=no/10;
          }
        //  System.out.println("revers is"+rev);
          String s=(rev==temp)?"Palindrom":"not palindrom";
          System.out.println(s);
       }      
   }