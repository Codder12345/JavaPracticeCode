import java.util.*;
import java.io.*;


 class MinimumDistance{
     public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.printf("Enter  array size:");
     int size=sc.nextInt();
      int a[]=new int[size];
       int i,j;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
      System.out.printf("Enter array element:");
      for(i=0;i<a.length;i++)
      {
       a[i]=sc.nextInt();
       }

      System.out.printf("Enter number for find distance:");
       int num=sc.nextInt();//5
       int num1=sc.nextInt();//4
        int count=0;
       // int d=a.length+1;
	//7 9 5 11 7 4 12 6 2 11
        
          int newD=Integer.MAX_VALUE;
       for(i=0;i<a.length;i++)
       {
         for(j=i+1;j<a.length;j++)
	  {
	     if(a[i]==num && a[j]==num1||a[i]==num1 &&a[j]==num)
             {
                
		if(newD>Math.abs(i-j))
 		  newD=Math.abs(i-j);
	     
              }
              }        
          
    }

       System.out.println(newD);
   
   }
  }