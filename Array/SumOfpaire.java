import java.util.*;
class   DeleteValue{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter array size");
int i,j;
int size=sc.nextInt();
int a[]=new int[size];
System.out.printf("Enter array element");
 for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("Enter value foe delete:");
int index=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(i==index)
{
a[i]=a[i+1];
}
}
}
}
}