import java.util.*;
 interface  Value
  {
    
    void setValue(int x,int y);
    
       int getResult();
    
  }
  class Add implements Value
  {
    int a,b;
    public void setValue(int x,int y)
    {
      a=x;
      b=y;
    }
    public int getResult()
    {
     return a+b;
    }
  }
  class Mul implements Value{
      int a,b;
      public void setValue(int x,int y)
      {
        a=x;
        b=y;
        
      }
     public int getResult()
     { 
      return a*b;
     }
  }
  public class DynamicPolyInfApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      
     Value v=null;
     v=new Add();
      System.out.println("Enter value of a and b for Addition:");
      int a=sc.nextInt();
      int b=sc.nextInt();
       v.setValue(a,b);
      int result=v.getResult();
      System.out.printf("Addition is%d\n",result);
      v=new Mul();
      System.out.println("Enter value of a and b for Multiplication:");
      int a1=sc.nextInt();
      int b1=sc.nextInt();
      v.setValue(a1,b1);
      result=v.getResult();
      System.out.printf("Multiplication is %d\n",result);
      
      
    }
  }