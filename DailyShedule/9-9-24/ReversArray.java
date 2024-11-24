 /* 15. Write program to create array of size 5 and reverse it
*/
import java.util.*;
  public class ReversArray{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of Array from user:");
       int size=sc.nextInt();
         int a[]=new int[size];
         System.out.println("Enter Array element:");
          for(int i=0;i<a.length;i++)
          {
           a[i]=sc.nextInt();
          }
          System.out.println("Revers Array:");
          int mid=a.length/2;
          int end=a.length-1;
          
          for(int i=0;i<mid;i++)
          {
           int temp=a[i];
           a[i]=a[end];
           a[end]=temp;
           end--;
          }
          for(int i=0;i<a.length;i++)
          {
           System.out.printf("\t"+a[i]);
          }
    }
  }