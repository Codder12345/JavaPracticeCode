 import java.utiil.*;
   class Maximum{
       public static void main(String arg[])
       {
          Scanner sc=new Scanner (System.in);
           System.out.println("Enter two number from user:");
           int a=sc.nextInt();
           int b=sc.nextInt();
           
           if(a>b)
           {
            System.out.println(" Maximum number is"+a);
           }
           else{
           System.out.println(" Maximum number is"+b);
           }
       }
    }