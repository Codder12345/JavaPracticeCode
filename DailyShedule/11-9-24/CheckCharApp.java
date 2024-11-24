import java.util.*;
   class CheckChar{
      char ch;
      void setChar(char ch)
      {
       this.ch=ch;
      }
      boolean checkChar()
      {
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
        {
           return true;
        }
        else if(ch>='0' && ch<='9')
        {
            return false;
        }
        else{
             return System.out.println("special symbol:");
        }
      
      }
   }
   public class CheckCharApp{
     public static void main(String arg[])
     {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter character from users:");
        char ch=sc.next().charAt(0);
        
        CheckChar c=new CheckChar();
        c.setChar(ch);
        c.checkChar();
         
     }
   }