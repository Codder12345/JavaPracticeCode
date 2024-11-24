import java.util.*;
  class MergeArray{
    int arr[], arr2[];
    void acceptArray(int a[],int b[]){
        arr=a;
        arr2=b;  
    }
    
    void ShowArray() {
       int k=0;
      int c[]=new int[arr.length+arr2.length];
      for(int i=0;i<arr.length;i++)
       {
         c[k]=arr[i];
        k++; 
       }
       for(int i=0;i<arr2.length;i++)
      {
        c[k]=arr2[i];
        k++;
      }
      
      for(int i=0;i<c.length;i++)
     {
         System.out.print(c[i]);
     }
        
    }
  }
   public class MergeArrayApp{
      public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
       System.out.printf("Enter array size:");
       int size=sc.nextInt();
        int a[]=new int[size];
        System.out.printf("Enter array element:");
         for(int i=0;i<a.length;i++)
         {
          a[i]=sc.nextInt();
        }
        System.out.printf("Enter array size:");
         int size2=sc.nextInt();
          int b[]=new int[size2];
          System.out.printf("Enter array element:");
           for(int i=0;i<b.length;i++)
          { 
            b[i]=sc.nextInt();
           }
           MergeArray abc=new MergeArray();
           abc.acceptArray(a,b); 
           abc.ShowArray();
            
 
       }
  }
