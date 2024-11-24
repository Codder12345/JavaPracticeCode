  import java.util.*;
   class UpperCaseLower{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter  alphabate");
           char ch=sc.next().charAt(0);
           
          if(ch>=65 && ch<=90)
          {
              System.out.println("Upper case Alphabate");
          }
          else if(ch>=97 && ch<=122)
          {
              System.out.println("Lower Case Alphabate");
          }
          else{
          System.out.println("Invaid alphabate");
          }
          
       }
    }