 import java.util.*;
   class PositiveNegative{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter only integer  number from user:");
           int a=sc.nextInt();
          
           if(a>0)
           {
            System.out.println(" number is positive:="+a);
           }
         else if(a<0)
           {
            System.out.println(" number is negative:"+a);
           }
           else{
           System.out.println("number is  zero.");
           }
       }
    }