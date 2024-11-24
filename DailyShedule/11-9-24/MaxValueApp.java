/*
Q3. Write program to create class name as FindMax with two functions  
void setArray(int a[]): this function is used for accept array as parameter  
int getMax(): this function can find the max value from array and return it. 
*/
import java.util.*;
  class MaxValue{
     int a[];
     void setArray(int a[])
     {
     this.a=a;
     }
     int getMax()
     {
       int max=0;
       for(int i=0;i<a.length;i++)
       {
        if(a[i]>max)
        {
        max=a[i];
        }
       }
       return max;
     }
  }
  public class MaxValueApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter array size");
        int size=sc.nextInt();
        int a[]=new int[size];
         System.out.println("Enter Array element:");
           for(int i=0;i<a.length;i++)
           {
            a[i]=sc.nextInt();
           }
           MaxValue m=new MaxValue();
           m.setArray(a);
           int res=m.getMax();
           System.out.println("MaxValue in Array is"+res);
           
    }
  }