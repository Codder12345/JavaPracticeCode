  import java.util.*;
    class Area{
     float r,pi=3.14f;
      int length,width;
       void setRadius(float r)
       {
        this.r=r;
       }
      
       void setLenghtwidth(int length,int width)
       {
        this.length=length;
        this.width=width;
       }
      
       
    }
   class CircleArea extends Area
    {
       float getCircleArea()
       {
       return pi*r*r;
       }
    }
    class Rectangle extends Area{
       int getRectangleArea()
       {
       return length*width;
       }
    }
     public class CalculateAreaApp{
       public static void main(String arg[])
       {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter  radius");
          float r=sc.nextFloat();
         CircleArea  c=new CircleArea ();
          c.setRadius(r);
          float res=c.getCircleArea();
          System.out.println(res);
          Rectangle v=new Rectangle();
           System.out.println("Enter length and width:");
            int l=sc.nextInt();
            int w=sc.nextInt();
          v.setLenghtwidth(l,w);
          int res1=v.getRectangleArea();
          System.out.println(res1);
          
          
       }
     }