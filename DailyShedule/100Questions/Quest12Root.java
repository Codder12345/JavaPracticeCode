/*
Write a C program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in C programming. Logic to find roots of quadratic equation in C programming.
Example
Input
Input a: 8
Input b: -4
Input c: -2
Output
Root1: 0.80
Root2: -0.30
*/

import java.util.*;
  class Quest12{
     public static void main(String arg[])
     {
      Scanner sc=new Scanner(System.in);
       System.out.println("a:");
       int a=sc.nextInt();
       System.out.println("b:");
        int b=sc.nextInt();
       System.out.println("c:");
       int c=sc.nextInt();
       double r=(b*b-4*a*c);
       double root1=0,root2=0;
        if(r>0)
        {
         root1=(-b+Math.sqrt(r))/(2*a);
         root2=(-b-Math.sqrt(r))/(2*a);
         System.out.println("Root1="+root1);
         System.out.println("Root2="+root2);
         
        }
        else if(r==0)
       {
         root1=-b/(2*a);
         root2=-b/(2*a);
        System.out.println("Root1:"+root1); 
        }
     else 
      {
       double real=-b/(2*a);
       double img=Math.sqrt(-r)/(2*a);
       System.out.println("Real part:"+real);
       System.out.println("image part:"+img);
      }      
     }
  } 