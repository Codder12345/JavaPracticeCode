import java.util.*;
class  AscendingElement{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter array size");
int i,j,temp;
int size=sc.nextInt();
int a[]=new int[size];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

int mid=a.length/2;
int end=a.length-1;
System.out.printf("Revers array");
for(i=0;i<mid;i++)
{
temp=a[i];
a[i]=a[end];
a[end]=temp;
}
for(i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
}
}