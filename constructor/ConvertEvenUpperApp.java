 import java.util.*;
  class ConvertToUpperOnEvenPosition{
      private char a[];
     ConvertToUpperOnEvenPosition(char a[] )
     {
      this.a=a;
     }
      public void Convert()
     { 
        for(int i=0;i<a.length;i++)
         {
             if(a[i]%2==0)
             {
               a[i]=a[i]-32;
               System.out.printf(a[i]);
             }
          }         
     }
      public  char getConvertedArray()
      {
      
      }     
   }
   public class ConvertEvenUpperApp{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner (System.in);
       System.out.println("Eter character array:");
        String s=sc.nextLine();
          char ch[]=s.toCharArray();
          ConvertToUpperOnEvenPosition p=new ConvertToUpperOnEvenPosition(ch);
           char res=p.getConvertedArray();
           System.out.println("Upper case is:"+res);
            
           
     }
   }