 import java.util.*;
class InsertionSort{
      int a[];
      InsertionSort(int a[])
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
          int key=a[i];
         int j=i-1;
         while(j>=0 && key<a[j])
         {
             a[j+1]=a[j];
             j--;
         }
         a[j+1]=key;
     }
     System.out.println("\n After Sorting:");
     for(int i=0;i<a.length;i++)
     {
          System.out.printf("\t"+a[i]);
     }
     
    }
}
 public class InsertionSortApp{
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