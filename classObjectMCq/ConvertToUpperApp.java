import java.util.*;
  class ConvertToUpper{
    
       char c[];
 void setCharArray(char ch[])
   {
     c=ch;
   } 
    void ConvertToUpperCase()
    {
          for(int  i=0;i<c.length;i++)
          {
             if(c[i]>=97 && c[i]<=122)
             {
                c[i]=(char)(c[i]-32);
             }
              System.out.print(c[i]);
          }
    }
   }
   public class ConvertToUpperApp{
         public static void main(String x[]) 
         {
            Scanner sc=new Scanner(System.in);
              System.out.println("Enter string");
               String s=sc.nextLine();
                char ch[]=s.toCharArray(); 
                 
             
              
              ConvertToUpper p=new ConvertToUpper();
               p.setCharArray(ch);
               p.ConvertToUpperCase();
              
              
              
         }
            
    }