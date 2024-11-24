/* 
  Q2. Write a program in JAVA to find create character array with size 10 and extract digit from character array and find its sum 
Example: abc124mno5
Output: 1+2+4+5= 12
*/ 

 import java.util.*;
  public class ExtractDigit {
    public static void main(String arg[])
        {
          Scanner sc=new Scanner (System.in);
            String s=sc.nextLine();
            char ch[]=s.toCharArray();
            int sum=0,i;
              for(i=0;i<ch.length;i++)
              {
                  if(ch[i]>='0' && ch[i]<='9')
                   {
                    sum=sum+ch[i]-48;
                  }
              }
               System.out.print(sum);

         }
 }