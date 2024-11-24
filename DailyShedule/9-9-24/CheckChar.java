/*
3. Write program to character from keyboard and check character is alphabet digit or special 
symbols?
*/
import java.util.*;
  class CheckChar{
       public static void main(String arg[])
       {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter character from character:");
           char ch=sc.next().charAt(0);
           if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
           {
                System.out.println("Character is alphabate");
           }
           else if(ch>='0' && ch<='9')
           {
                System.out.println("Character is Digit");
           }
           else{
             System.out.println("Characte is  special symbol");
           }
           
       }
  }