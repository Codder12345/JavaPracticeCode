// Swap first and last digit;


import java.util.*;
class SwapDigit{
public static void main(String arg[])
{
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter number from user");
  int no=sc.nextInt();
  int first,last,mid,c=1,temp;
  temp=no;
  while(no!=0)
  {
   no/=10;
   c=c*10;
  }
  no=temp;
  
  first=no*10/(c*10/10);//1234*10/1000
  last=no%10;
  System.out.println("first"+first);
  System.out.println("last="+last);
  no=temp;
  mid=no%(c/10)/10;
int  swap=(last*(c/10)+mid*10)+first;
  System.out.print(swap);
  
  
}
}