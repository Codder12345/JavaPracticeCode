
import java.util.*;
   class MergeTwoArray{
     int [] a,b;
       MergeTwoArray(int a[],int b[])
       {
         this.a=a;
         this.b=b;
       }
       void  getMergeArray()
       {
       int k=0;
        int  c[]=new int[a.length+b.length];
          for(int i=0;i<a.length;i++)
          {
           c[k++]=a[i];
          }
          for(int i=0;i<b.length;i++)
          {
            c[k++]=b[i];
          }
          System.out.println(" Display MergeTwoArray");
           for(int i=0;i<c.length;i++)
           {
            System.out.printf("\t"+c[i]);
           }
       } 
   }
   public class MergeTwoArrayApp{
     public static void main(String arg[])
     {
       Scanner sc=new Scanner (System.in);
        //first array
        System.out.println("Enter array size:");
         int size=sc.nextInt();
        int a[]= new int[size];
        System.out.println("Enter Array element:");
         for(int i=0;i<a.length;i++)
            {
             a[i]=sc.nextInt();
            }  
          // second array            
          System.out.println("Enter array size:");
          int size1=sc.nextInt();
          int b[]= new int[size1];
          System.out.println("Enter Array element:");
          for(int i=0;i<b.length;i++)
            {
             b[i]=sc.nextInt();
            }   

           MergeTwoArray m=new MergeTwoArray(a,b);
           m.getMergeArray();           
            
     }
   }