import java.util.*;
  class ArrSum{
    int a[];
    void setValue(int a[])
    {
     this.a=a;
    }
    int GetSum()
    {
     int sum=0;
     for(int i=0;i<a.length;i++)
     {
      sum=sum+a[i];
     }
     return  sum;
    }
    
  }
  public class ArraySumApp{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size:");
          int size=sc.nextInt();
          
          int a[]=new int[size];
          System.out.println("Enter arrya element:");
           for(int i=0;i<a.length;i++)
           {
            a[i]=sc.nextInt();
           }
           
           ArrSum a1=new ArrSum();
             a1.setValue(a);
             int res=a1.GetSum();
             System.out.println("Sum of Array is :"+res);
      }
  }