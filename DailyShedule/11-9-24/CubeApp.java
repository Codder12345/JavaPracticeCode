/*
Q1. Write a program to create class name as Cube with two methods  
void setValue(int x): this function accept number as parameter 
int getCube(): this function can calculate cube of number and return it. 
*/
import java.util.*;
   class  Cube
   {
     int x;
     void setValue(int x)
     {
      this.x=x;
     }
     int getCube()
     {
        return x*x*x;
     }
     
   }
   public class CubeApp
   {
    public static void main(String arg[])
    {
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter value for cube:");
     int a=sc.nextInt();
       Cube c=new Cube();
        c.setValue(a);
        int res=c.getCube();
        System.out.println(res);
    }
   }