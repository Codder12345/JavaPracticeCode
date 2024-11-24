/*
14. Write program to create array of size 10 and find occurrence of every element in array? 
*/
 import java.util.*;
   public class Occurrence{
     public static void main(String arg[])
     {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter arrray size");
       int size=sc.nextInt();
       System.out.println("Enter arrya element:");
       int a[]=new int[size];
          for(int i=0;i<a.length;i++)
           {
            a[i]=sc.nextInt();
            }           
            
            System.out.println("Find Occurrence of each element:");
             for(int i=0;i<a.length;i++)
             {
                int count=1;
              for(int j=i+1;j<a.length;j++)
              {
                 
               if(a[i]==a[j])
               {
                count++;
                a[j]=-1;
               }
              }
              if(a[i]!=-1)
              {
              System.out.println(a[i]+"-->"+count);
              }
             }
             
     }
   }