 /*
  Q3. WAP to print the following series?
Given an integer, we have to write a Fibonacci series program in C up to the nth term using loop and recursion. We have to print all the numbers of the series from starting up to the Nth term where N is the input given by the user.
Example:
Input1:  10
Output1: 0 1 1 2 3 5 8 13 21 34
Explanation:
1st term = 0
2nd term = 1
3rd term = 1st term + 2nd term = 0 + 1 = 1
4th term = 2ndterm + 3rd term = 1 + 1 = 2
And so on……

*/

class Fibonacciseries{
 public static void main(String arg[])
    {
    Scanner sc=new Scanner (System.in);
          System.out.printf("Enter number:");
           int no=sc.nextInt();
        
            int Third=Integer.MAX_VALUE;
             int first=0,second=1;
               System.out.printf("%d\n",first);
                System.out.printf("%d\n",second);


             for(int i=2;i<no;i++)
            {
                 
                Third=first+second;
                 first=second;
                  second=Third;
                System.out.print(Third);
                 
                System.out.println();
                   
              
             }  
             
      
       

    }
  }