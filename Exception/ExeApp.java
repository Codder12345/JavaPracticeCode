 import java.util.*;
 
public class ExeApp{
  public static void main(String ...arg)
  {
   Scanner sc=new Scanner (System.in);
    int a,b,c;
 System.out.println("Enter two values");
 a=sc.nextInt();
 b=sc.nextInt();
 try{
   c=a/b;
   System.out.printf("Division is=%d",c);
 }
 catch(ArithmeticException ex)
 {
   System.out.println("Second values should not zero");
   System.out.println("Error"+ex);
  
 }
  System.out.println("Logic1");
  System.out.println("Logic 2");
  System.out.println("Logic 3");
  }
}