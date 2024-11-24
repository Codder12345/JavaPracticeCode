  import java.util.*;
   class CheckLeap{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter year");
           int a=sc.nextInt();
          
           String res=(a%4==0 && a%100!=0)||(a%400==0)?"Leap year.":"Not Leap";
            System.out.println(res);
       }
    }