/*
Clear Day
Chef classifies a day to be either rainy, cloudy, or clear.
In a particular week, Chef finds X days to be rainy and Y days to be cloudy.
Find the number of clear days in the week.
Input Format
•	The first and only line of input will contain two space-separated integers X and Y, denoting the number of rainy and cloudy days in the week.

Output Format
Output the number of clear days in the week.

Constraints
•	0≤X, Y≤7
•	0≤X+Y≤7

Sample 1:
Input    Output
2   3           2
Explanation:
There are 7 days in a week. If there are 2 rainy days and 3 cloudy days, then the remaining 7−2−3=2 days are clear.


*/

 import java.util.*;
   class Days{
     public static void main(String arg[])
     {
       Scanner sc=new Scanner(System.in);
         System.out.println("Enter two number X rainy and Y cloudy: ");
         int x=sc.nextInt();
         int y=sc.nextInt();
         int NOday=7;
         if(x>0&& y<7)
         {
             NOday=NOday-x-y;
         System.out.println("Remaninig Days is:"+NOday);
         }
         
     }
   }