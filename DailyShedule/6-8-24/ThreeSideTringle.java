 /*
 15.Write a C program to input all sides of a triangle and check whether triangle is valid or not.
 */
 import java.util.*;
   class  ThreeSideTringle{
      public static void main(String arg[])
      {
          Scanner sc=new Scanner (System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          
          if(a+b>c &&b+c>a && a+c>b)//7+5>10  5+10>7  7+10>5
          {
              System.out.println("tringle is valid:");
              
          }
          else{
              System.out.println("Not Valid.");
          }
      }
   }