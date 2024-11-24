   
/* 20) Write a program in C to find a subarray with given sum from the given array?
Expected Output :
The given array is : 3 4 -7 1 3 3 1 -4
[0..1] -- { 3 4 }
[0..5] -- { 3 4 -7 1 3 3 }
[3..5] -- { 1 3 3 }
[4..6] -- { 3 3 1 }  */



      import java.util.*;
       public class SubArray{
        public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
        System.out.printf("Enter Array size");
      int  size=sc.nextInt();
      int a[]=new int[size];
      int i;
        System.out.printf("Enter Array element");
      for(i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
         }
    
         for(i=0;i<a.length;i++)
        {
          System.out.printf("%d \t",a[i]);
         }
           System.out.printf("\n Enter  starting index and end \n");
            int start=sc.nextInt();
           int end=sc.nextInt();
            for(i=start;i<end;i++)
           {
              System.out.printf("%d \t",a[i]);
          }
    
  
      }
    }