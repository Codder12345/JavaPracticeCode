import java.util.*;
  class PrimeNumber{
     public static void main(String arg[])
     {
       Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
         int temp,count=0;
       for( int i=1;i<=no;i++)
       {
            temp=i;
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
            System.out.printf("%d \t",i);
           }
      }
     }
  }