  import java.util.*;
   class CheckAlphabate{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter year");
           char ch=sc.next().charAt(0);
          
         //  String res=((ch>='A' && ch<='Z') || (ch<='a' && ch<='z'))?"Alphabate":"Not Alphabate";
          //  System.out.println(res);
          if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
          {
              System.out.println("Alphabate.");
          }
          else{
              System.out.println("Not Alphabate.");
          }
       }
    }