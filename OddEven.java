import java.util.*;
public class  PositiveNegative{
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
System.out.printf("positive elelment is :");
for(i=0;i<a.length;i++)
{ 
if(a[i]>0)
{
System.out.printf("%d \t",a[i]);
}
}
System.out.println();
System.out.printf("Negative elelment is :");
for(i=0;i<a.length;i++)
{ 
if(a[i]<0)
{
System.out.printf("%d \t",a[i]);
}
}
}
}