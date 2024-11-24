import java.util.*;
public class  OddEven{
static  int a[];
public static void main(String arg[])
{
int i;
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("Even elelment is :");
for(i=0;i<a.length;i++)
{ 
if(a[i]%2==0)
{
System.out.printf("%d",a[i]);
}
}
System.out.printf("Odd elelment is :");
for(i=0;i<a.length;i++)
{ 
if(a[i]%2!=0)
{
System.out.printf("%d",a[i]);
}
}
}
}