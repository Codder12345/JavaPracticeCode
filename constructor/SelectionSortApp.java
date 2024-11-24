 import java.util.*;
class SelectionSort{
      int a[];
      SelectionSort(int a[])
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
          int key=i;
         for(int j=i+1;j<a.length;j++)
         {
          if(a[key]>a[j])
          {
           key=j;
          }
         }
         int temp=a[key];
         a[key]=a[i];
         a[i]=temp;
     }
     System.out.println("\n After Sorting:");
     for(int i=0;i<a.length;i++)
     {
          System.out.printf("\t"+a[i]);
     }
     
    }
}
 public class SelectionSortApp{
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
     SelectionSort s=new SelectionSort(a);
     s. beforeSort();
     s.afterSort();
  }
}