 /*
 17.Write a C program to find all roots of a quadratic equation.
 */
  import java.util.*;
    class RootQuadric{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner (System.in);
          System.out.println("Enter quadratics points:");
            int x=sc.nextInt();
            int y=sc.nextInt();
            
             if(x>0 &&y>0)
             {
                System.out.println("quadratic equation. I");
             }
             else if(x<0 && y>0)
             {
             System.out.println("quadratic equation. II");
             }
             else if(x<0 && y<0)
             {
             System.out.println("quadratic equation. III");
             }
             else{
             System.out.println("quadratic equation. IV");
             }
             
          
      }
    }