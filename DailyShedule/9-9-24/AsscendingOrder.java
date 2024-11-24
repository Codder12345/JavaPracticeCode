/*
12. Write program to create array of size and arrange all values in ascending order? 
*/
import java.util.*;
  public class AsscendingOrder{
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
            System.out.println("Display AsscendingOrder array:");
            int temp;
            for(int i=0;i<a.length;i++)
            {
              for(int j=i+1;j<a.length;j++)
              {
              if(a[i]>a[j]){
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
               }
              }
            }
             for(int i=0;i<a.length;i++)
            {
           System.out.printf("\t"+a[i]);
            }
            
         }
   }