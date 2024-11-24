import java.util.*;
class SumMatrix{
 public static void main(String arg[])
  { 
      Scanner sc=new Scanner(System.in);
        int i,j,size;
        System.out.printf("Enter array size");
        int a[][]=new int[3][3];
          int b[][]=new int[3][3];
        System.out.printf("Enter array element:");
       for(i=0;i<a.length;i++)
         {
          for(j=0;j<a[i].length;j++)
         {
          a[i][j]=sc.nextInt();
         }
         }
            System.out.printf("Enter array element:");
           for(i=0;i<b.length;i++)
         {
          for(j=0;j<b[i].length;j++)
         {
          b[i][j]=sc.nextInt();
         }
         }
           int sum=0;
            for(i=0;i<a.length;i++)
         {
          for(j=0;j<a[i].length;j++)
         {
          sum=a[i][j]+b[i][j];
          System.out.printf(" %d\t ",sum);

         }
          System.out.println();
         }
      }
   }