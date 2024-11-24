import java.util.*;
import java.lang.Math;

class PalindromPattern
{
     public static void main(String arg[])
	 {
		 
		  Scanner sc=new Scanner (System.in);
	   int n=sc.nextInt();
         int z=1;
	     
	    for(int i=1;i<n;i++)//3 4 -7 1 3 3 1 -4
		 {
		  for(int j=n-1;j>i;j--)
		   {
		    System.out.printf(" ");
		    }
			
			for(int k=z;k>=1;k--)
			{
			 System.out.print(abs(k-i)+1);
			}
			z+=2;
			System.out.println();
		  }
	 }
}