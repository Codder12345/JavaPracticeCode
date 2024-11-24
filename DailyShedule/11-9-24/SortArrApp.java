/*
Q4. Write program to create class name as SortArr with two functions  
void setArray(int a[]): this function can accept array as parameter  
int [] getSortArray(): this function can perform sorting on array and return sorted array 
*/
import java.util.*;
   class SortArr{
     int a[];
     void setArray(int a[])
     {
       this.a=a;
     }
    public int [] getArray()
     {
        for(int i=0;i<a.length;i++)
        {
         for(int j=i+1;j<a.length;j++)
         {
            if(a[i]>a[j])
          {
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
          }
         }
        }
      //  for(int i=0;i<a.length;i++)
        //{
          //  System.out.printf("\t"+a[i]);
        //}
        return a;
     }
     
   }
   public class SortArrApp{
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
       SortArr r=new SortArr();
        r.setArray(a);
        int []res=r.getArray();
         for(int i=0;i<a.length;i++)
         {
              System.out.printf("\t"+res[i]);
         }
       
    }
   }