import java.util.*;

class Factorial{
  private  int x;
    void SetNum(int no)
    
   {
     x=no;
   }

    void CalFactorial()
   {
    int f=1;
   for(int i=1;i<=x;i++)
    {
     f=f*i;
    }
     System.out.printf("Factorial %d is = %d",x,f);
   }
  }
  public class AppFactorial{
   public static void main(String arg[])
     {
      Scanner sc=new Scanner (System.in);
      System.out.printf("Enter number for fact is:");
     int x=sc.nextInt();
      
     Factorial f1=new Factorial();
       f1.SetNum(x);
      f1.CalFactorial();
          
    }  
 }