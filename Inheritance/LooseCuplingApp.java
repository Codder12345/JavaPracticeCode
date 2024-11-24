import java.util.*;
  abstract class Value {
     int a,b;
       void setValue(int x,int y)
       {
         a=x;
         b=y;          
       }
        abstract void performCalculation();
  }
  class Add extends Value
  {
   void performCalculation()
   {
    System.out.println("Addition is="+(a+b));
   }
  }
  class Mul extends Value
  {
   void performCalculation()
   {
    System.out.println("Multiplication is ="+(a*b));
   }
  }
  class Div extends Value{
     void performCalculation()
     {
      System.out.println("Ddivision is="+a/b);
     }
  }
  class Sub extends Value{
     void performCalculation()
     {
      System.out.println("Substraction id "+(a-b));
     }
  }
  class Calculator{
   void performOperation(Value v)
    {
     v.performCalculation();
    }
   
  }
 public class  LooseCuplingApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter value of a and b to perform operation:");
         int a=sc.nextInt();
         int b=sc.nextInt();
        Calculator c=new Calculator();
         int ch;
       do{
            System.out.println("1: Addition");
             System.out.println("2: Multiplication");
              System.out.println("3:Division");
               System.out.println("4: Substraction");
                System.out.println("0:Exit");
               System.out.println("Enter your choice:");
               ch=sc.nextInt();
         
          switch(ch)
          {
               case 1:
               Add add=new Add();
               add.setValue(a,b);
               add.performCalculation();
               break;
                case 2:
               Mul mul=new Mul();
               mul.setValue(a,b);
               mul.performCalculation();
               break;
                case 3:
               Div div=new Div();
               div.setValue(a,b);
               div.performCalculation();
               break;
                case 4:
               Sub sub=new Sub();
               sub.setValue(a,b);
               sub.performCalculation();
               break;
               default :
               System.out.println("invalid choice:");
               break;
          }              
       }while(ch!=0);
                
    }
    
  }