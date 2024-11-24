 import java.util.*;
class Bubble{
      int a[];
      Bubble(int a[])
    {
     this.a=a;
    }      
    void beforeSort()
    {
     System.out.println("Before Sorting:");
      for(int i=0;i<a.length;i++)
      {
       System.out.print("\t"+a[i]);
      }
    }
    void afterSort()
    {
     for(int i=0;i<a.length;i++)
     {
      for(int j=0;j<a.length-1;j++)
      {
       if(a[i]<a[j])
       {
           int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
       }
      }
     }
     System.out.println("\n After Sorting:");
     for(int i=0;i<a.length;i++)
     {
          System.out.printf("\t"+a[i]);
     }
     
    }
}
 public class BubbleSort{
   public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter array element:");
     for(int i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
     }
     Bubble b=new Bubble(a);
     b. beforeSort();
     b.afterSort();
  }
}