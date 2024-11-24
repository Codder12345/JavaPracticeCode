import java.util.*;
public class SwapFirstLastDigit{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number for sumof  Digit:");
int no=sc.nextInt();
int temp=no;
int  rem=0;
int Ld=no%10;
while(no!=0)
{
rem=no%10;
no=no/10;
}
no=temp;
System.out.printf("First Digit is  :%d\n",rem);
System.out.printf("First Digit is :%d  \n ",Ld);
int sum=0;
sum=rem+Ld;
int s=rem;
rem=Ld;
Ld=s;

System.out.printf(" Sum of First and Last Digit :%d=%d %d \n",no,rem,Ld);
}
}