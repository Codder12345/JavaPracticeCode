
 /*24) Write a program in C to count the number of inversion in a given array
Expected Output :
The given array is : 1 9 6 4 5
The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
The number of inversion can be formed from the array is: 5  */
       

        import java.util.*;
    class   InversionArray{
      public static void main(String arg[])
       {
         Scanner sc=new Scanner(System.in);
          int i,j;
         System.out.printf("Enter array size:");
         int  size=sc.nextInt();
         int a[]=new int[size];
         System.out.printf("Enter array element:");
         for(i=0;i<a.length;i++)
          { 
           a[i]=sc.nextInt();
          } 
           int count=0;
          for(i=0;i<a.length;i++)
          {
           for(j=i+1;j<a.length;j++)
            {
              if(a[i]>a[j])
              {
                 System.out.printf("(%d ,%d) \n",a[i],a[j]);
                count++;
                }  
             }
           }
          System.out.printf("The number of inversion can be formed from the array is:%d",count);  
        }
     }
      