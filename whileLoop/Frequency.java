import java.util.*;
class Frequency{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.print("Enter array element");
int i,j,count;
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
count=1;
for(j=i+1;j<5;j++)
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
System.out.println();
}
}
}
}