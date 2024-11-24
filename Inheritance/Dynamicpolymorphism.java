class Value {
   int a,b;
   void setValue(int x,int y)
   {
     a=x;
     b=y;
   }
   int getResult()
   {
    return 0;
   }
   
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
public class Dynamicpolymorphism{
  public static void main(String arg[])
  {
   Value v=new Add();
     v.setValue(10,20);
     int res=v.getResult();
      System.out.printf("Addition is=%d",res);
       v=new Mul();
      v.setValue(10,20);
      int res1=v.getResult();
   System.out.printf(" \nMultiplication is %d",res1);      
  }
}