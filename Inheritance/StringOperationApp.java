import java.util.*;
   abstract class StringOperation{
        String str;
        
       abstract void performOperation(String x);
   }
  class ConvertToUpper extends StringOperation{
                 char ch[];
        void performOperation(String str)
        {
          
             ch=str.toCharArray();
         for(int i=0;i<ch.length;i++)
          {
             if(ch[i]>=97 && ch[i]<=122)
            {
             ch[i]=(char)((int)ch[i]-32);
            }
         }
         System.out.println(ch);
        }
   }
   class MaxRepetativeChar  extends StringOperation{
         
          void performOperation(String str)
          {
               char ch[]=str.toCharArray();
                int  Maxcount=0,count;   
                 char c=' ';
                for(int i=0;i<ch.length;i++)
                {
                      count=1;
                   for(int j=i+1;j<ch.length-1;j++)
                   {
                        
                        if(ch[i]==ch[j])
                        {
                             count++;
                        }
                   }             
                      if(Maxcount<count)
                      {
                           Maxcount=count;
                           c=ch[i];
                      }                          
                }
                System.out.println("MaxRepetative character is :="+c+"------->"+Maxcount);
            
          }
   }
   
   class WordRevers extends StringOperation
   {
     void performOperation(String str)
     {
         char ch[];
          ch=str.toCharArray();
         /* int mid=(ch.length/2);
         char rev[]=new char[ch.length];
         int j=0;
         for(int i=mid;i<ch.length;i++)
         {
              rev[j++]=ch[i];
         } 
         for(int i=0;i<mid;i++)
         {
             rev[j++]=ch[i];
         }
         for(int i=0;i<rev.length;i++)
         {
             System.out.print(rev[i]);
         }
           */        
         for(int i=ch.length-1;i>=0;i--)
         {
             System.out.print(ch[i]);
         }

     }         
   }
   public class StringOperationApp{
     public static void main(String ...x)
     {
      Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        
     // ConvertToUpper c=new ConvertToUpper();
      //c.performOperation(str);
       
       MaxRepetativeChar m=new MaxRepetativeChar();
        m.performOperation(str);
      
  //      WordRevers w=new WordRevers();
    //    w.performOperation(str);
       
        
     }
   }
   