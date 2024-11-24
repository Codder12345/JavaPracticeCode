/*
14.Write a C program to input angles of a triangle and check whether triangle is valid or not.
*/
import java.util.*;
   class Tringle{
     public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter three angle is:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
           int t=a+b+c;
            if(t==180)
             {
               System.out.println("Tringle is valid:");
                
              }
              else{
               System.out.println("not valid Tringle");
            }
     }
   }