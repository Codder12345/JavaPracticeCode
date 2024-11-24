/*
19.Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F

*/
import java.util.*;
  class CalculatePercentage{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner (System.in);
       System.out.println("Enter marks for physics");
        int p=sc.nextInt();
         System.out.println("Enter marks for Chemistry");
        int c=sc.nextInt();
         System.out.println("Enter marks for Biology:");
        int b=sc.nextInt();
         System.out.println("Enter marks for Mathematics:");
        int m=sc.nextInt();
         System.out.println("Enter marks for computer:");
        int com=sc.nextInt();
         int tot=p+c+b+m+com;
         int  per=tot/5;
         System.out.println("Total percentage is"+per);
          if(per>=90)
          {
           System.out.println("Grad A");
          }
          else if(per>=80 &&per<90)
          {
           System.out.println("Grad B");
          }
          else if(per>=70 && per<80)
          {
           System.out.println("Grad C");
          }
          else if(per>=60 && per<70)
          {
           System.out.println("Grad D");
          }
          else if(per>=40 &&  per<60)
          {
           System.out.println("Grad E");
          }
          else if(per<40){
           System.out.println("Grad F");
          }
          else{
               System.out.println("Invalid percentage.");
          }
        
    }
  }