import java.util.*;
   public class SmallestElement{
     public static void main(String arg[])
     {
      Scanner sc=new Scanner (System.in);
       System.out.println("Enter array size:");
         int size=sc.nextInt();
           int a[]=new int[size];
          System.out.println("Enter array element:");
           for(int  i=0;i<a.length;i++)
           {
            a[i]=sc.nextInt();
           }
           int s=0;
           for(int i=0;i<a.length;i++)
           {
           if(s<a[i])
           {
             s=a[i];
           }
            int s2=a[0];
            for( i=1;i<a.length;i++)
            {
                 if(a[i]<s2 && a[i]>s)
                 {
                      s2=a[i];
                 }
            }                
            System.out.println("second Smallest no is:"+s2);
             
              
           }           
      
     }
   }