/*
Double Rent
Chefina decided to move into Chef's apartment.
Chef was initially paying a rent of X rupees. Since Chefina is moving in, the owner decided to double the rent.
Find the final rent Chef needs to pay.

Input Format
The input consists of a single integer X denoting the rent Chef was initially paying.

Output Format
Output on a new line, the final rent Chef needs to pay.

Constraints
1≤X≤10
Sample 1:
Input    Output
2        4

Explanation:
Chef was initially paying   2  rupees. After Chefina moves in, he needs to pay 2*2=4

Sample 2:
Input   Output
3         6

Explanation:
Chef was initially paying 3 rupees. After Chefina moves in, he needs to pay 2⋅3=6

*/
 import java.util.*;
  class  DobleRent{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter initially Rent:");
       int rent=sc.nextInt();
        if(rent>0)
        {
        
          System.out.println("chefs was initially paying"+rent+" rupees.After Chefina DobleRent:"+rent*2);
        }
    }
  }