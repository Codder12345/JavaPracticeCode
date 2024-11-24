abstract class Value{
    int a,b;
    void setValue(int x,int y)
    {
      a=x;
      b=y;
    }
    abstract int getResult();
 }
 class Add extends Value{
     int getResult()
     {
      return a+b;
     }
 }
 class Mul extends Value{
    int getResult()
    {
     return a*b;
    }
 }
 public class DynamiPolymorphism{
    public static void main(String arg[])
    {
      Value v=null;
      v=new Add();
      v.setValue(10,20);
       int res=v.getResult();
       System.out.println("Addition is ="+res);
       v=new Mul();
       v.setValue(5,4);
      int res1=v.getResult();
      System.out.println("Multiplication is="+res1);      
    }
 }