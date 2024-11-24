 //Write a program in JAVA to find the second smallest element in an array without using sorting?
import java.util.*;
class SecondMin{
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
			  }    int min=0;
			 for(i=0;i<a.length;i++)
			 {
				  if(min<a[i])
				  {
				 min=a[i];
				  }
			 }
			   
			   int min1=0;
			   for(i=0;i<a.length;i++)
			   {
                                  min1=a[i];
                                 for(int j=i+1;j<a.length;j++)
                             {
                               
				  if(a[j]<min1 && a[j]>min)
				  {
					   min1=a[j];
				  }	
                               }				  
			   }
			
       System.out.printf("Second smallest number is :%d",min1);
       

    }
  }