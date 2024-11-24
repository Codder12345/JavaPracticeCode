/*
16.Write a C program to check whether the triangle is equilateral, isosceles or scalene triangle.
*/
import java.util.*;
  class CheckIsosceles{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter three angle of tringle:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         
         if(a==b && b==c && a==c)
         {
           System.out.println("Equilateral Tringle:");
         }
         else if(a==b || b==c || a==c){
           System.out.println("isosceles Tringle.");
         }
         else{
             System.out.println("Scalene.");
         }
        
      }
  }