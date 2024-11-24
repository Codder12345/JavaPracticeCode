 import java.util.*;
   class Divisible5and11{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter only integer  number from user:");
           int a=sc.nextInt();
          
           if(a%5==0 && a%11==0)
           {
            System.out.println("number is divible by 5 and 11 ="+a);
           }
           else{
           System.out.println("number is not divisible.");
           }
       }
    }