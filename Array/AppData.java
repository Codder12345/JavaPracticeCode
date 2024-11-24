import java.util.*;
  class Square{
       private int x;
     void setValue(int x)
     {
       this.x=x;
     }
   void  showSquare() 
    {
    System.out.printf("Square of %d is= %d",x,x*x);
    }

   };
  public class AppData{
  public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
    Square s=new Square();
    s.setValue(x);
   s.showSquare();
   }  
  }