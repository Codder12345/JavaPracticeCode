/* 28)Write a program in C to print all possible combinations of r elements in a given array.
Expected Output:
The given array is:
1 5 4 6 8 The combination from by the number of elements are: 4
The combinations are:
1 5 4 6
1 5 4 8
1 5 6 8
1 4 6 8
5 4 6 8 */
 
import java.util.*;
 class CombinationElement{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.printf("Enter size of array:"); 
     int size=sc.nextInt();
     int a[]=new int[size];
     for(i=0;i<a.length;i++)
      {
       a[i]=sc.nextInt();
     }
 
   }  
}
