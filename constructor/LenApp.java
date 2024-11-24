 import java.util.*;
class  LenCount{
 char a[];
         LenCount(char a[])
         { 
          this.a=a;
         }
         public int getLength()
         {
           int count=0;
            for(int i=0;i<a.length;i++)
             {
              count++;
             }
             return count;
         }
}
  public class LenApp{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string");
      String s=sc.nextLine();
            char ch[]=s.toCharArray();
       LenCount l=new LenCount(ch);
       int res=l.getLength();
      System.out.println(res);       
   }
  }