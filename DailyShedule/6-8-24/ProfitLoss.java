/*
18.Write a C program to calculate profit or loss.
*/
 import java.util.*;
  class ProfitLoss{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter cost price and selling price:");
         int cp=sc.nextInt();
         int sp=sc.nextInt();
         
          String s=(sp>cp)?"Profit":"Loss";
            System.out.println(s);
       
    }
  }