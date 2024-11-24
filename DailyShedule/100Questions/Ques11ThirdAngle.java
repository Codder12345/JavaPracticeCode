/*Write a C Program to input two angles from user and find third angle of the triangle. How to find all angles of a triangle if two angles are given by user using C programming. C program to calculate the third angle of a triangle if two angles are given.
ExampleInput
Enter first angle: 60
Enter second angle: 80
Output
Third angle = 40
*/
   import java.util.*;
     class Ques11{
        public static void main(String arg[])
        {
         Scanner sc=new Scanner (System.in);
          System.out.println("First angle:");
           int a=sc.nextInt();
           System.out.println("Enter second angle:");
            int b=sc.nextInt();
            System.out.println("Third angle is:"+(180-(a+b)));
        }
     }
   