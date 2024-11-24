import java .util.*;
   class CheckAlphabate{
       public static void main(String arg[])
        {
          Scanner sc=new Scanner (System.in);
           // String s=sc.nextLine();
              // char ch=s.toCharArray();
               char ch=sc.nextLine().charAt(0);
              if( ch>='A' && ch<='Z' || ch>='a'&&ch<='z')
               {
                System.out.printf("character is alphabate.");
               }
              else if(ch>='0' && ch<='9'){
                System.out.printf("character is Digit"); 
             }
              else{
                System.out.printf("character is special symbol.");
              }
             
        }   
   } 