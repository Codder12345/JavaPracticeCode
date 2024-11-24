  import java.util.*;
   class CheckAlphabateDigit{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter any character");
           char ch=sc.next().charAt(0);
          
       
          if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
          {
              System.out.println("Alphabate.");
          }
          else if(ch>='0' && ch<='9'){
              System.out.println("Digit");
          }
          else{
           System.out.println("Special Symbol");
          }
       }
    }