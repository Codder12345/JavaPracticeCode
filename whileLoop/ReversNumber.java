import java.util.*;
public class SumFirstLastDigit{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number for sumof  Digit:");
int no=sc.nextInt();
int sum=0, rem=0;
while(no!=0)
{
rem=no%10;
no=no/10;
}
System.out.printf("First Digit is %d",rem);
}
}