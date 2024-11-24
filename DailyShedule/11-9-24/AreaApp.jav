import java.util.*;
  class Area{
     float r,area;
     int length,width;
     final pi=3.14f;
      Area (float r)
      {
       this.r=r;
       area=pi*r*r;
       //System.out.prinln("area is "+area);

      }
      Area(int length,int width)
      {
       this.length=length;
       this.width=width;
        area=length*width;  
      }
      System.out.prinln(area);
      
  }
  public class AreaApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter radious");
      float r=sc.nextFloat();
       Area a=new area(r);
       System.out.prinln("Enter length and width:");
       int length=sc.nextInt();
       int width=sc.nextInt();
       Area a=new Area(length,width);
       
       
    }
  }