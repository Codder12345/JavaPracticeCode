import java.util.*;
   public class Revers{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
            int no=sc.nextInt();
           int rem=0,rev=0;
          while(no!=0)
          {
           rem=no%10;
           rev=rev*10+rem;
           no=no/10;
          }
          System.out.println("revers is"+rev);
       }      
   }