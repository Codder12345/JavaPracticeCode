import java.util.*;
  class Seller{
     int sp,cp;
      void acceptSelCostPrice(int sp,int cp)
      {
        this.cp=cp;
        this.sp=sp;
       }
       void showProfitLoss()
       {
         if(cp<sp)
         {
          System.out.println("Profit.");
         }
         else{
          System.out.println("Loss.");
          }
       }
   }
   public class SellerApp{
     public static void main(String arg[])
     {
       Scanner sc=new Scanner (System.in);
         System.out.println("Enter cost price and selling price of a product:");
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        Seller s=new Seller();
        s.acceptSelCostPrice(sp,cp);
         s.showProfitLoss();        
     }
    }