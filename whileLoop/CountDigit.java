import java.util.*;
public class SumFirstLastDigit{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number for  count Digit in Number:");
int no=sc.nextInt();
int sum=0;
while(no!=0)
{
no=no/10;
sum=sum+no;
}
System.out.printf("sum of digit: %d",sum);
}
}