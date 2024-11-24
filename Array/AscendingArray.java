import java.util.*;
class  AscendingElement{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter array size");

int size=sc.nextInt();
int a[]=new int[size];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf(" Display asecending order");
for(i=0;i<a.length;i++)
{
if(a[i]>a[i+1])
{
int temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
}
for(i=0;i<a.length;i++)
{
System.out.print("\t  %d",a[i]);
}
}
}