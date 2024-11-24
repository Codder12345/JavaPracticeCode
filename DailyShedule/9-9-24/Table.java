/*
4. Write a program to input number and print its table? 
*/
import java.util.*;
  public class Table{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner (System.in);
       System.out.println("Enter  number for print it's table:");
         int no=sc.nextInt();
         for(int i=1;i<=10;i++)
         {
          System.out.println(no*i);
         }
    }
  }