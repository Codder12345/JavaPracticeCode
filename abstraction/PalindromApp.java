import java.util.*;
   abstract class Palindrom{
      String str;
      void setString(String str)
      {
       this.str=str;
      }
      abstract void  isPalindrom();
  }
  class checkPalindrom extends Palindrom{
         void isPalindrom()
         {
              String rev="";
           for(int i=str.length()-1;i>=0;i--)
           {
             rev=rev+str.charAt(i);
           }
           System.out.println(str);
            System.out.println(rev);
             if(str.equals(rev))
           {
               System.out.println("String is palindrom:");
           }
           else{
               System.out.println("Not palindrom");
           }
           
         }
  }
  public class PalindromApp{
     public static void main(String arg[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter string :");
          String s=sc.nextLine();
        checkPalindrom p=new checkPalindrom();
        p.setString(s);
        p.isPalindrom();
     }         
  }