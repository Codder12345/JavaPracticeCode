import java.util.*;
 class Circle{
   private float r;
   private  float pi=3.14f;
   
    void setRadius(float  radius){
       r=radius;
     }  
    void CalArea()
  {
 
   System.out.printf(" Area of circle is %f ",pi*r*r);
  }   
  };
  
   public  class  AppCircle{
   public static void main(String arg[])
   {
    
    Scanner sc=new Scanner(System.in);
     System.out.printf("Enter area of circle:");
     float r=sc.nextFloat();
      Circle c=new Circle();
     c.setRadius(r);
     c.CalArea();   
  }
  }
