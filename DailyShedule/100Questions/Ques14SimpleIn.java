/*Write a C program to input principle, time and rate (P, T, R) from user and find Simple Interest. How to calculate simple interest in C programming. Logic to find simple interest in C program./
*/
import java.util.*;
  class Ques14{
      public static void main(String arg[])
       {
        Scanner sc=new  Scanner(System.in);
          System.out.println("Enter principle amt");
           int p=sc.nextInt();
         System.out.println("Enter rate");
           float r=sc.nextFloat();
         System.out.println("Enter time:");
          int t=sc.nextInt();
          float si=p*r*t/100; 
         System.out.println("Simple interest is:"+si);          
       }
  }