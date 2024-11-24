 //Write a program in JAVA to find the second smallest element in an array without using sorting?
import java.util.*;
class SecondLargest{
 public static void main(String arg[])
    {
    Scanner sc=new Scanner (System.in);
          System.out.printf("Enter array size:");
           int size=sc.nextInt();
         int a[]=new int[size];
          System.out.printf("Enter array elements:");
           int i;
		      for(i=0;i<a.length;i++)
			  {
				  a[i]=sc.nextInt();
			  }
            int max=0;
			 for(i=0;i<a.length;i++)
			 {
				  if(a[i]>max)
				  {
					   max=a[i];
				  }
			 }
			   
			   int max1=a[0];
			   for(i=1;i<a.length;i++)
			   {
				  if(a[i]>max1 && a[i]<max)
				  {
					   max1=a[i];
				  }					  
			   }
			
       System.out.printf("Second smallest number is :%d",max1);
       

    }
  }