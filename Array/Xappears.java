/* 21) Write a program in C to find if a given integer x appears more than n/2 times in a sorted array 
of n integers ?
Expected Output :
The given array is : 1 3 3 5 4 3 2 3 3
The given value is : 3
3 appears more than 4 times in the given array[] */


     import java.util.*;
    class  Xappears{
      public static void main(String arg[])
       {
         Scanner sc=new Scanner(System.in);
          int i;
         System.out.printf("Enter array size:");
         int  size=sc.nextInt();
         int a[]=new int[size];
         System.out.printf("Enter array element:");
         for(i=0;i<a.length;i++)
          { 
           a[i]=sc.nextInt();
          }
           System.out.printf("The given value is:");
            int x=sc.nextInt();
         int count=0;
         for(i=0;i<a.length;i++)
          { 
           if(a[i]==x){
           count++;
           }
          }
           System.out.printf("%d appears more than %d times in given array[]",x,count); 
           
        }
     }
      