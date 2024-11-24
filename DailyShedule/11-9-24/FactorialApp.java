/*
Q2. Write program to create class name as Factorial with two functions  
void setValue(int x): this function accept  number as parameter 
int getFactorial(): this function can calculate factorial of number and return it.
*/
import java.util.*;
    class Factorial{
      int x;
      void setValue(int x)
      {
       this.x=x;
      }
      int getFactorial()
      {
      int f=1;
       for(int i=1;i<=x;i++)
       {
          f=f*i;
       }
       return f;
      }
      
   }
   public class FactorialApp{
     public static void main(String arg[])
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value");
      System.out.println();
       int a=sc.nextInt();
       
       Factorial f=new Factorial();
       f.setValue(a);
       int res=f.getFactorial();
       System.out.println("factorial is ="+res);
     }
   }