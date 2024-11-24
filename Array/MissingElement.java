import java.util.*;
class MissingElement{
public static void main(String arg[])
{
Scanner sc=new Scanner (System.in);
System.out.printf("Enter array size");
int size=sc.nextInt();
int i,j;
int a[]=new int[size];
System.out.printf("Enter array element:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("Display original array");
for(i=0;i<a.length;i++)
{
System.out.printf("%d \t",a[i]);
}
//find missing element logic
System.out.printf(" \nDisplay smallest missing element");
for(i=0;i<(a.length-1);i++)
{
for(j=a[i];j<(a[i+1]-1);)
{
System.out.printf("%d\t",++j);
}
}
}
}