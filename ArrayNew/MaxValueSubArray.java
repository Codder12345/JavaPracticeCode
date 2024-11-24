/*
32)Write a program in C to find the maximum for each and every contigious subarray of size k 
from a given array.
Expected Output:
The given array is:
1 3 6 21 4 9 12 3 16 10
The length of each subarray is: 4
The contagious subarray of length 4 and their maximum value are:
1 3 6 21 ----> 21
3 6 21 4 ----> 21
6 21 4 9 ----> 21
21 4 9 12 ----> 21
4 9 12 3 ----> 12
9 12 3 16 ----> 16
12 3 16 10 ----> 16
*/

import java.util.*;

class MaxValueSubArray{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		
		for(int i=0;i<a.length-(n-1);i++)
		{
			int max=a[i];
			for(int j=i;j<n+i;j++)
			{
				if(max<a[j])
				{
					max=a[j];
			    }
				System.out.print(" "+a[j]);
		}
		System.out.println("-->"+max);
		// n++;
		}
	}
}