import java.util.*;
  class Circle{
      private  float radius;
    void setRadius(float radius)
    {
      this.radius=radius;
    }
    void showArea()
    {
        float area,pi=3.14f;
        area=pi*radius*radius;
        System.out.println("area is"+area);
    }
  }
   public class AreaApp
   {
   public static void main(String arg[])
   {
         Scanner sc=new Scanner (System.in);
          System.out.println("Enter radious");
           float radius=sc.nextFloat();
             Circle c=new Circle();
             c.setRadius(radius);
             c.showArea();
   }
   }
  