  import java.util.*;
   class CheckVowel{
       public static void main(String arg[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter  alphabate");
           char ch=sc.next().charAt(0);
           
          if(ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U' ||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
              System.out.println("vowel.");
          }
          else
          {
              System.out.println("Constant ");
          }
          
       }
    }