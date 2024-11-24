import java.util.*;
public class  MenuDrive{
static  int a[];
public static void main(String arg[])
{
int i;
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
do{
System.out.printf("1: Revers all numbers");
System.out.printf("2:sort all number in ascending order: ");
System.out.printf("3:sort all  in descending order:");
System.out.printf("4:Shift all even number to front and odd number to back:");
System.out.printf("5:Display only Prime Number:");
System.out.printf("6:Display sum of all Digits: ");
System.out.printf("0:Exit");
System.out.printf("Enter your choice:");
int ch=sc.nextInt();
switch(ch)
{
case 1:
for(i=0;i<a.length;i++)
{
int temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
for(i=0;i<a.length;i++)
{
System.out.printf("%d",a[i]);
}
break;
}
}while(ch!=0);
}
}