import java.util.*;
class RotateArray{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter array size");
int size=sc.nextInt();
int i;
int a[]=new int[size];
int b[]=new int[size];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("Enter value for rotate array");
int c=0;
int k=sc.nextInt();
for(i=k;i<a.length;i++)
{
b[c]=a[i];
c++;
}
for(i=0;i<k;i++)
{
b[c]=a[i];
c++;
}
for(i=0;i<b.length;i++)
{
System.out.printf("\t %d",b[i]);
}
}
}