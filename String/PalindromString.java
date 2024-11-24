import java.util.*;
  class PalindromString{
    public static void main(String arg[])
    {
     Scanner sc= new Scanner (System.in);
      System.out.println("Enter String from users:");
        String str=sc.nextLine();
        String pa=str;
         char s[]=str.toCharArray();
          String rev=" ";
          for(int i=s.length-1;i>=0;i--)
          {
               rev=rev+s[i];
          }
          System.out.println(rev);
          if(rev==pa)
          {
               System.out.println("Palindrom");
          }
          else{
               System.out.println("Not Palindrom");
          }
           
               
              
            
    }
  }