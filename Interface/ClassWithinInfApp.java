interface A
{
 void show();
 class B implements A
 {
 void Display()
 {
   System.out.println("I am display");
 }
 }
 public void show()
 {
  System.out.println("I am show mwthod");
 }
}
class C extends B
{
  public void show()
  {
       System.out.println("I am show method from c ");
  }
}
public class ClassWithinInfApp{
  public static void main(String arg[])
  {
      
   C c1=new C();
   c1.show();
   c1.display();
  }
}