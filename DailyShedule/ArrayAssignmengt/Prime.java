import java.util.*;
  class Prime{
     public static void main(String arg[])
     {
       Scanner sc=new Scanner(System.in);
         System.out.println("Enter n value:");
          int n=sc.nextInt();
            int count;
         for(int i=2;i<n;i++)
          {
            int temp=i;
                count=0;
              for(int j=1;j<=temp;j++)
              {
                if(temp%j==0)
                {
                 count++;
                }
              }
              if(count==2)
              {
               System.out.println(i);
              }
            }       
           
                 
     }
  }