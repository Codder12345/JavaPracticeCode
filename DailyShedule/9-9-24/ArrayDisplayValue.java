/*
10. Write program to create array of size 5 and display its value? 
*/
import java.util.*;
  public class ArrayDisplayValue{
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
            System.out.println("Display array:");
            for(int i=0;i<a.length;i++)
            {
             System.out.printf("\t"+a[i]); 
            }
         }
   }