import java .util.*;
import java.lang.String;
 class ExtractDigit{ 
      char arr[];
        void setValue(char a[])
      {
        arr=a;
       }
     void  getSum()
     {
          int sum=0;
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>='0' &&arr[i]<='9')
           {
             sum=sum+(int)arr[i]-48;   
           }
        }
         System.out.print(sum);
       }
   }
 public class ExtractDigitApp{
    public static void main(String arg[])
     {
     Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
     char ch[]=str.toCharArray();
       ExtractDigit c=new ExtractDigit();
       c.setValue(ch);
       c.getSum();
     } 
   
  }