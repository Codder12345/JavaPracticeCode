import java.util.*;
   class Rectangle{
        int length; 
        int breadth;
        float area;
       
        Rectangle()
       {
         length=0;
         breadth=0;
         
     
       }
       Rectangle(int length,int breadth)
       {
           this.length=length;
            this.breadth=breadth;
                     
       }
       Rectangle(int length)
       {
            this.length=length;
            breadth=length;
       }
        void calArea()
       {
        System.out.println("area is "+(length*breadth));
       }
}
public class RectangleApp{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 //call default constructor
 Rectangle r=new Rectangle();
 r.calArea();
 System.out.println("Enter length and breadth");
 int length=sc.nextInt();
 int breadth=sc.nextInt();
 // call parameter constructor
 Rectangle r1=new Rectangle(length,breadth);
 r1.calArea();
 //call 1 parameter constructor
 Rectangle r2=new Rectangle(length);
   r2.calArea();
 
 }
}