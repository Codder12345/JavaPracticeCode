import java.util.*;
class MaxMin{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter size of array");
int size=sc.nextInt();
int i;
int a[]=new int[size];
System.out.printf("Enter array element");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int max=0;
for(i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
int min=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.printf("Max value is %d \n",max);
System.out.printf("Max value is %d",min);


}
}