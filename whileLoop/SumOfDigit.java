import java.util.*;
public class ProductDigit{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number for sumof  Digit:");
int no=sc.nextInt();
int sum=1, rem=0;
while(no!=0)
{
rem=no%10;//1234=4 
sum=sum*rem;//0+4=4
no=no/10;
}
System.out.printf("sum of digit: %d",sum);
}
}