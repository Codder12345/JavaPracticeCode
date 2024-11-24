/*
34)Remove duplicates from unsorted array using Set data structure
Given an unsorted array of integers, print the array after removing the duplicate elements from it.
We need to print distinct array elements according to their first occurrence.
Examples:
Input: arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
Output: 1 2 5 7 4
Explanation: {1, 2} appear more than one time.
Input: arr[] = { 3, 3, 4, 1, 1}
Output: 3 4 1

*/
import java.util.*;

class RemoveDuplicate{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array element");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++){

			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length-1;i++)
		{
				if(a[i]==a[i+1])
				{
				  	continue;
				}
				else{
					System.out.print("" +a[i]);
				}
                

		}

	}
}