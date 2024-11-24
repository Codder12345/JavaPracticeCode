 import java.util.*;
class MergeSort{
      int a[];
      MergeSort(int a[])
       {
           this.a=a;
         }      
    void   beforeSort()
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
          
          
     }
     System.out.println("\n After Sorting:");
     for(int i=0;i<a.length;i++)
     {
          System.out.printf("\t"+a[i]);
     }
     
    }
}
 public class MergeSortApp{
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
     InsertionSort I=new InsertionSort(a);
     I. beforeSort();
     I.afterSort();
  }
}