import java.util.*;
public class  MenuDrive{
static  int a[];
public static void main(String arg[])
{
int i,j;
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
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
int mid=a.length/2;
int end=a.length-1;
for(i=0;i<a.length;i++)
{
temp=a[i];
a[i]=a[end];
a[end]=temp;
end--;
}
System.out.println();
break;

case 2:
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.printf("%d \t",a[i]);

}
System.out.println();
break;

case 3:
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.printf("%d \t",a[i]);

}
System.out.println();
break;

case 4:
for(i=0;i<a.length;i++)
{
if(a[i]%2==0)
System.out.printf("%d \t",a[i]);
}
for(i=0;i<a.length;i++)
{
if(a[i]%2!=0)
System.out.printf("%d \t",a[i]);
}
System.out.println();
break;
case 5:
int f;
for(i=0;i<a.length;i++)
{
f=0;
for(j=1;j<a.length;j++)
{
  if(a[i]%j==0)
{
f++;
}
}
if(f==2)
{
System.out.printf("%d \t ",a[i]);
}
}
System.out.println();
break;

case 6:
int sum=0;
for(i=0;i<a.length;i++)
{
   sum=sum+a[i];
}
System.out.printf("sum is :%d \n",sum);
break;
default:
System.out.printf("Enter valid choice");
System.out.println();
break;
}
}while(ch!=0);
}
}