   /* 
    Q3. Write a program in C to rotate an array by N positions.
Expected Output:
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
*/
   import java.util.*;
          public class RotateArray{

          public static void main(String arg[])
              {
               Scanner sc=new Scanner (System.in);
              System.out.printf("Enter size of array:");
                int size=sc.nextInt();
                int a[]=new int[size];
                 int b[]=new int[size];
                 int i;
               System.out.printf("Enter array element:");
                   for(i=0;i<a.length;i++)
                    {
                     a[i]=sc.nextInt();
                    }
                 System.out.printf("Enter value for rotate Array:");
                 int k=sc.nextInt();
                    int j=0;
               for( i=k;i<a.length;i++)
               {
                   b[j++]=a[i];
                     
               }
               for( i=0;i<k;i++)
               {
                   b[j++]=a[i];
                    
               }
                for( i=0;i<a.length;i++)
               {
                System.out.printf(" %d\t ",+b[i]);
               }
              }
         }