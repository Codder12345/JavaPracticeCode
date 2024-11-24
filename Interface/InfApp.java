// interface to interface

interface A
{
 void show();
}
interface B extends A
{
 void Display();
}

class C implements B
{
 public void show()
 {
  System.out.println("I am show mwthod");
 }
 public void Display()
 {
 System.out.println("I am displya method");
 }
}
public class InfApp{
  public static void main(String arg[])
  {
   C c1=new C();
     c1.show();
     c1.displya();
  }
}