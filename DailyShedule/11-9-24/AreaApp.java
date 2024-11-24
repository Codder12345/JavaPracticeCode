import java.util.*;
  class Area{
     float r,area;
     int length,width;
     float pi=3.14f;
      Area (float r)
      {
       this.r=r;
       area=pi*r*r;
       System.out.println("area is "+area);

      }
      Area(int length,int width)
      {
       this.length=length;
       this.width=width;
        area=length*width; 
  System.out.println(area);        
      }
     
      
  }
  public class AreaApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter radious");
      float r=sc.nextFloat();
       Area m=new Area(r);
       System.out.println("Enter length and width:");
       int length=sc.nextInt();
       int width=sc.nextInt();
       Area n=new Area(length,width);
       
       
    }
  }