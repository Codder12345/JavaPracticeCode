import java.util.*;
    class Value{
           int x,y;     
      void setValue(int x,int y)
       {
       this.x=x;
       this.y=y;
         
        }        
    }
    class Add extends Value{
           int getAdd()
           {
              return  x+y;
           }
    }
    class Mul extends Value{
        int getMul()
        {
        return x*y;
        }
    }
    class Div extends Value{
       int getDiv()
       {
       return x/y;
       }
    }
    public class ResultApp{
      public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter value  x and y:");
         int x=sc.nextInt();
         int y=sc.nextInt();
           
        
         Value v=new Value();
           //v.setValue(x,y);
         Add a=new Add();
          a.setValue(x,y);
          int res2=a.getAdd();
           System.out.println(res2);
            
            Mul m=new Mul();
            m.setValue(x,y);
          int res=m.getMul();
          System.out.println(res);
          
          Div d=new Div();
            d.setValue(x,y);
           int res1=d.getDiv();      
           System.out.println(res1);           
         
      }
    }
    