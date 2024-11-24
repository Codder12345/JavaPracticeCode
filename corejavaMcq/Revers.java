import java.util.*;
  class Revers{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner (System.in);
       int no=sc.nextInt();
         int rev=0,rem=0;
         while(no!=0)
         {
         rem=no%10;
         rev=rev*10+rem;
         no=no/10;
         }
         System.out.println("Revers is:"+rev);
           
         
    }
  }