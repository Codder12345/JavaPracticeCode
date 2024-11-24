import java.util.*;
public class  MenuDrive2{
static  int a[];
public static void main(String arg[])
{
int i,j;
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int ch;
do{
System.out.printf("1: Revers all numbers \n");
System.out.printf("2:sort all number in ascending order: \n");
System.out.printf("3:sort all  in descending order:\n");
System.out.printf("4:Shift all even number to front and odd number to back:\n");
System.out.printf("5:Display only Prime Number:\n");
System.out.printf("6:Display sum of all Digits: \n");
System.out.printf("0:Exit \n");
System.out.printf("Enter your choice:\n");
ch=sc.nextInt();
switch(ch)
{
case 1:
int temp;
for(i=0;i<a.length;i++)
{
 temp=a[i];
int rev=0,rem=0;
  while(temp!=0)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
System.out.printf("%d \t",rev);
}
System.out.println();
break;

case 2:
int p, count,tem;
for(i=0;i<a.length;i++)
{
p=a[i];
count=0;
while(p!=0)
{
p=p/10;
count++;
}
p=a[i];
int c[]=new int[count];
int x=0;
while(p!=0)
{
  c[x]=p%10;
  p=p/10;
x++;
}
for(j=0;j<c.length;j++)
{
for(int k=j+1;k<c.length;k++)
{
if(c[j]>c[k])
{
 tem=c[j];
 c[j]=c[k];
 c[k]=tem;
}
}
System.out.print(c[j]);
}
System.out.println();
}
break;
case 3:
for(i=0;i<a.length;i++)
{
temp=a[i];
count=0;
while(temp!=0)
{
temp=temp/10;
count++;
}

int c[]=new int[count];
for(j=0;j<=c.length;j++)
{
for(int k=j+1;k<c.length;k++)
{
if(c[j]<c[k])
{
tem=c[j];
c[j]=c[k];
c[k]=tem;
}
}
System.out.print(c[j]);
}
System.out.println();
}
break;

case 4:
int rem=0;
for(i=0;i<a.length;i++)
{
temp=a[i];
while(temp!=0)
{
rem=temp%10;
if(rem%2==0)
{
System.out.print(rem);
}
temp=temp/10;
}
temp=a[i];
while(temp!=0)
{
rem=temp%10;
if(rem%2!=0)
{
System.out.print(rem);
}
temp=temp/10;
}
System.out.print("\t\t");
}
break;

case 5:
rem=0;
for(i=0;i<a.length;i++)
{
temp=a[i];
while(temp!=0)
{
rem=temp%10;
count=0;
for(j=1;j<=rem;j++)
{
if(rem%j==0)
{
count++;
}
}
if(count==2)
{
System.out.print(rem);
}
temp=temp/10;
}
System.out.print("\t");
}
System.out.println();
break;


case 6:
for(i=0;i<a.length;i++)
{
 temp=a[i];
int sum=0;
 rem=0;
while(temp!=0)
{
rem=temp%10;
sum=sum+rem;
temp=temp/10;
}
System.out.print(sum);
System.out.print("\t");
}
System.out.print("\n");
break;
}
}while(ch!=0);
}
}