/*
20) Write a program in C to find a subarray with given sum from the given array?
Expected Output :
The given array is : 3 4 -7 1 3 3 1 -4
[0..1] -- { 3 4 }
[0..5] -- { 3 4 -7 1 3 3 }
[3..5] -- { 1 3 3 }
[4..6] -- { 3 3 1 }
*/

import java.util.*;
class SumofsubArray20{
	public static void main(String arh[])
	{
		Scanner sc=new Scanner (System.in);
		//Enter size for user input
		 System.out.println("Enter array sizd:");
		int size=sc.nextInt();
	  //Enter array from user
		int a[]=new int [size];
          int i,j,k;
       // Enter array element
	    System.out.println("Enter array element:");
	   for(i=0;i<a.length;i++)
	   {
        a[i]=sc.nextInt();
	   }
    // Enter sum from input	
       System.out.println("Enter sum from user");   
	   int s=sc.nextInt();
	    for(i=0;i<a.length;i++)
	      {
		   int sum=a[i];
		   if(a[i]==s)
		   {
			   System.out.println("Element found"+a[i]);
		   }
		   else{
			   
		      for(j=i+1;j<a.length;j++)
		        {
			     sum+=a[j];
				  if(s==sum)
				  {
				    System.out.println("["+i+".."+j+"]"+"\t");
				     System.out.print("{");
				     for(k=i;k<=j;k++)
				     {
					   System.out.print(a[k]+" ");
				     }
					 System.out.println("}");
				 }
		      }
            }		  
	   
	    }
 
      }
	}