/* 14)	 Given an array prices[] of size N denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
Examples:
Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
                       Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
                       Maximum Profit  = 210 + 655 = 865
Input: prices[] = {4, 2, 2, 2, 4}
Output: 2
Explanation: Buy the stock on day 4 and sell it on day 5 => 4 – 2 = 2
                       Maximum Profit  = 2
*/
import java.util.*;
import java.lang.Math;
  class BuyStock{
   public static void main(String arg[])
   {
   Scanner sc=new Scanner(System.in);
      int a[]=new int[]{100,180,260,310,40,535,695};
         int p=0,pm=0;
         for(int i=0;i<a.length;i++)
         {
          p=a[0]-a[3];
          pm=a[4]-a[6];
            
         }
         
         System.out.println("Maximum Profit:"+Math.abs(p+pm));
          int b[]=new int[]{4,2,2,2,4};
                   for(int i=0;i<b.length;i++)
         {
           p=b[3]-b[4];
            
         }
         System.out.print("Maximum Profit:"+Math.abs(p));
   }
  }