 import java.util.*;
   class EvenNumber{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter only integer  number from user:");
           int a=sc.nextInt();
          
           if(a%2==0)
           {
            System.out.println(a+"number is even");
           }
           else{
           System.out.println(a+"number is odd");
           }
       }
    }