import java.util.*;
public class  SumOfArray{
static  int a[];
public static void main(String arg[])
{
int i;
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
int sum=sum+a[i];
}
System.out.printf("%d",sum);
}
}