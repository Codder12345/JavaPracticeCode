 class Add{
    int x,y;
     void setValue(int x,int y)
     {
        this.x=x;
        this.y=y;
     }
     int getResult()
     {
      return x+y;
     }
 }
 class Mul {
   int x,y;
   void setValue(int x,int y)
   {
    this.x=x;
    this.y=y;
   }
   int getResult()
   {
    return x*y;
   }
 }
 class Sub{
  int x,y;
  void setValue(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
  int getResult()
  {
   return x-y;
  }
 }
 class Calculator{
    void performOperation(Add ad)
    {
     int result=ad.getResult();
     System.out.println("Result is"+result);
    }
    void performOperation(Mul ml)
    {
     int result=ml.getResult();
     System.out.println("Result is"+result);
    }
    void performOperation(Sub sb)
    {
     int result=sb.getResult();
     System.out.println("Result is"+result);
    }
 }
  public class TightCupling{
   public static void main(String arg[])
   {
    Calculator c=new Calculator();
     Add ad=new Add();
      ad.setValue(4,5);
      c.performOperation(ad);
      Mul ml= new Mul();
      ml.setValue(20,2);
      c.performOperation(ml);
      Sub sb=new Sub();
      sb.setValue(3,5);
      c.performOperation(sb);
      
   }
}  