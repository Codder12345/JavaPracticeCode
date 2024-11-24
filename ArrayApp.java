import java.util.*;
public class ArrayApp{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i,max=0;
System.out.println("Enter array element");
for(i=0;i<a.length;i++)
{
 a[i]=sc.nextInt();
}
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
System.out.printf("mix values is %d",max);
System.out.println();

System.out.printf("min values is %d",min);
 
}
}

