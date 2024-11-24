 import java.util.*;
   class MaximumThree{
       public static void main(String arg[])
       {
          Scanner sc=new Scanner (System.in);
           System.out.println("Enter three number from user:");
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();
           if(a>b &&a>c)
           {
            System.out.println("maximum number is:="+a);
           }
         else if(b>c)
           {
            System.out.println("maximum number is:"+b);
           }
           else{
           System.out.println("maximum number is ="+c);
           }
       }
    }