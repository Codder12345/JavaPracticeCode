import java.util.*;
 class Circle
 {
   float Rdi,pi=3.14f;
   public void setRedius(float Rdi)
   {
     this.Rdi=Rdi;
   }
   public void Area()
   {
     float area=pi*Rdi*Rdi;
	 float Circomeference=2*pi*Rdi;
	 System.out.println("Area of circle is:="+area);
	 System.out.println("Circomeference of circle is:"+Circomeference);
   
   }
   
 }
 public class AreaofCircleApp
 {
   public static void main(String arg[])
   {
     Scanner sc=new Scanner (System.in);
	 System.out.println("Ente Radious:");
	 float Radious=sc.nextFloat();
	 Circle c=new Circle();
	 c.setRedius(Radious);
	 c.Area();
   }
 }