import java .util.*;
public class  SumEvenNumber{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter any number for sum");
int n=sc.nextInt();
 int i=1,sum=0;
while(i<=n)
{
if(i%2==0)
{
sum=sum+i;
}
i++;
}
System.out.printf("%d",sum);
}
}
