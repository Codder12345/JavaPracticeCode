import java.util.*;
 class Rectangle
 {
   int length,breadth,length1,breadth2;
     Rectangle(int length,int breadth,int length1,int breadth2)
	 {
	   this.length=length;
	   this.breadth=breadth;
	   this.length1=length1;
	   this.breadth2=breadth2;
	 }
	 public float Area()
	 {
	  float  Area1=length*breadth;
	  float Area2=length1*breadth2;
	 float  Areaofrectangle=Area1+Area2;
	  return Areaofrectangle;
	 }
	 
 }
  public class  AreaofrectangelApp
  {
   public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
	 System.out.println("Enter length  and breadth of Rectangle");
	  int length=sc.nextInt();
	  int breadth=sc.nextInt();
	  System.out.println("Enter length1 and length3 of second rectangle");
	   int length1=sc.nextInt();
	   int breadth2=sc.nextInt();
	  Rectangle r1=new Rectangle(length,breadth,length1,breadth2);
      float res=r1.Area();	
     System.out.println("Area of Two Rectangle is:"+res);	  
   }
  }