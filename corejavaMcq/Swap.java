//import java.util.*;
 public class Swap{
   public static void main (String x[])
   {
      //  Scanner sc=new Scanner(System.in);
          int a=Integer.parseInt(x[0]);
          int b=Integer.parseInt(x[1]);
       // int a=sc.nextInt();
    //    int b=sc.nextInt();
          a=a+b;
          b=a-b;
          a=a-b; 
        System.out.printf(a+""+b);
     

       
     
   }
}