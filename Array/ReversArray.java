import java.util.*;
class  Occurrence{
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
int count;
for(i=0;i<a.length;i++)
{
count=1;
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
count++;
a[j]=-1;
}
}
if(a[i]!=-1)
{
System.out.printf("%d->%d",a[i],count);
}
}
}
}