/*
36)Write a program in C for addition of two Matrices of same size.
Test Data :
Input the size of the square matrix (less than 5): 2
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Input elements in the second matrix :
element - [0],[0] : 5
element - [0],[1] : 6
element - [1],[0] : 7
element - [1],[1] : 8
1 2
3 4
The Second matrix is :
5 6
7 8
The Addition of two matrix is :
6 8
10 12
*/
   
     import java.util.*;
	 class AdditionTwoMatrix{
	      public static void main(String arg[])
		  {
			   Scanner sc=new Scanner (System.in);
			   System.out.println("Enter size of row and colunm:");
			   int m=sc.nextInt();
			   int n=sc.nextInt();
			   int a[][]=new int[m][n];
			   System.out.println(" Enter array element:");
			   for(int i=0;i<m;i++)
			   {
				 for(int j=0;j<n;j++)
				 {
					  a[i][j]=sc.nextInt();
				 }					 
			   }
			   
				//Enter second Array
			    System.out.println("Enter size of row and colunm:");
			   int p=sc.nextInt();
			   int q=sc.nextInt();
			   int b[][]=new int[p][q];
			   System.out.println(" Enter array element:");
			   for(int k=0;k<p;k++)
			   {
				 for(int l=0;l<q;l++)
				 {
					  b[k][l]=sc.nextInt();
				 }					 
			   }
                  
                   //Display first matrix;
			   for(int i=0;i<m;i++)
			   {
				 for(int j=0;j<n;j++)
				 {
					  System.out.print(""+a[i][j]);
				 }					 
				 System.out.println();
			   }
			    System.out.println();
				
			   //Display second matrix
			    for(int k=0;k<p;k++)
			   {
				 for(int l=0;l<q;l++)
				 {
					 System.out.print(""+b[k][l]);
				 }		
                System.out.println();				 
			   }
			   
			   
		  }
		  
	 }