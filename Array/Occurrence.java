import java.util.*;
class  MergeArray{
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
int b[]=new int[size];
System.out.printf("Enter array element");
for(i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
}
int k=0;
int c[k];
for(i=0;i<a.length;i++)
{
c[k]=a[i];
k++;
} 
for(i=0;i<b.length;i++)
{
c[k]=b[i];
k++;
}
for(i=0;i<=k;i++)
{
System.out.printf(c[i]);
}
}
}
}