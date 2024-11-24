import java.util.*;
  class OccurrenceChar{
     public static void main(String arg[])
     {
      Scanner sc=new Scanner(System.in);
       String str="aaaaaaaaaaaaaaabbbbbbbbcdddddddddddeeeeeee";
        char s[]=str.toCharArray();
        int Ncount=0;
         char ch=' ';
         for(int i=0;i<s.length;i++)
         {
              int count=1;
          for(int j=i+1;j<s.length;j++)
          {
           if(s[i]==s[j])
           {
              count++;              
          }
          }
            if(count>Ncount)
            {
                 ch=s[i];
                  Ncount=count;
                 continue;
            }
         }
        System.out.println(ch+"--->"+Ncount);
     }
   }