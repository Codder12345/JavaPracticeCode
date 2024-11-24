import java.util.*;
public class MaxMin
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int max=0,i;
System.out.println("Enter The Array Values:");
for(i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}

for(i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.printf("Max value is %d",max);
}
}