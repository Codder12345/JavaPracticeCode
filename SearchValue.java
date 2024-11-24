import java.util.*;
public class SearchValue{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i;
for(i=0;i<a.length;i++)
{
 a[i]=sc.nextInt();
}
System.out.printf("Enter value for search");
int value=sc.nextInt();
int f=0;
for(i=0;i<a.length;i++)
{
 if(a[i]==value){
f=1;
}
}
if(f==1)
{
System.out.printf("value is found");
}
else{
System.out.printf("not found value");
}
}
}
