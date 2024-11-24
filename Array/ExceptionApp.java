import java.util.*;
  public class ExceptionApp{
    public static void main(String arg[])
    
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter Value of a and b");
       int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
          int c=a/b;
          System.out.println("Division is:"+c);
        }        
        catch(ArithmeticException ex)
        {
         System.out.println("Second value should not zero");
          System.out.println("Error is "+ex);
        }
        
         System.out.println("I am Finally");
    }
  }