/*
11. Write program to create array of size 5 and find max value? 
*/
import java.util.*;
  public class MaxValue{
         public static void main(String x[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter array size:");
          int size=sc.nextInt();
           System.out.println("Enter array element:");
           int a[]=new int[size];
            for(int i=0;i<a.length;i++)
            {
            a[i]=sc.nextInt();
            }
           // System.out.println("Display array:");
            int max=0;
            for(int i=0;i<a.length;i++)
            {
              if(a[i]>=max)
              {
              max=a[i];
              }
            }
            System.out.println("max values is"+max);
         }
   }