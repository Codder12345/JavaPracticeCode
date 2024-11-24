import java.util.*;
 class Rectangle
 {
   private int length;
   private int wid;
   
     void setLengthWidth(int length,int wid)
     {
        this.length=length;
        this.wid=wid;
     }
     void showArea()
     {
       float area;
        area=length*wid;
        System.out.println("Area of rectangle is:"+area);
     }
   
 }
 
 public class AreaRecApp{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width:");
         int length=sc.nextInt();
         int width=sc.nextInt();
         Rectangle r=new Rectangle();
         r.setLengthWidth(length,width);
         r.showArea();
    }
  }