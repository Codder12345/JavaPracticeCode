/*\35) Write a program in C for a 2D array of size 3x3 and print the matrix ?
Test Data :
Input elements in the matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [0],[2] : 3
element - [1],[0] : 4
element - [1],[1] : 5
element - [1],[2] : 6
element - [2],[0] : 7
element - [2],[1] : 8
element - [2],[2] : 9
Expected Output :
The matrix is :
1 2 3
4 5 6
7 8 9
*/

import java.util.*;

     class TwoDArray{
       public static void main(String arg[])
	 {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter value for row and column according you:");
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 int a[][]=new int[n][m];
		 System.out.println("Enter arrya element:");
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
	 }
   }