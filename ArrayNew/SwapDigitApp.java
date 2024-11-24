import java.util.*;
 import java.lang.Math;  
    class SwapDigit
   {
        int n;
  void setValue(int x)
  {
     n=x;
  }   
  void getNumAfterSwap()
  {
    int temp=n,count=0,f;
    System.out.println("Number:"+n);
    int l=temp%10;
    while(temp!=0)
    { 
      count++; 
     temp=temp/10;
    }
    temp=n;
     /* int i=1,p=1;
      while(i<=count)
         {
           p=n*i;
          i++;
         } */
    int p=(int)Math.pow(10,(--count));
    f=temp/p;
    n=(n%p)-l;
    n=(l*(p))+n+f;
   System.out.println("Number:"+n);
   
  }
      
  }

   public class SwapDigitApp{
       public static void main(String arg[])
       {
       Scanner sc=new Scanner(System.in);
         System.out.printf("Enter number:");
          int no=sc.nextInt();
          SwapDigit s=new SwapDigit();
          s.setValue(no);
         s.getNumAfterSwap();
        
      
     }
  }