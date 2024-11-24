 //Write a program in JAVA to find the second smallest element in an array without using sorting?
import java.util.*;
class SecondSmallest{
 public static void main(String arg[])
    {
    Scanner sc=new Scanner (System.in);
          System.out.printf("Enter array size:");
           int size=sc.nextInt();
         int a[]=new int[size];
          System.out.printf("Enter array elements:");
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
           for(int i=0;i<a.length;i++)
            {
               a[i]=sc.nextInt();
              }
           for(int i=0;i<a.length;i++)
           {
             if(a[i]<first)
               {
                 second=first;
                  first=a[i];
                 
                }
              else if(second>a[i])
               {
                second=a[i];
              }
          }
       System.out.printf("Second smallest number is :%d",second);
       

    }
  }