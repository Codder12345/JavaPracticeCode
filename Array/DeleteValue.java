import java.util.*;
class   DeleteValue{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter array size");
int i,j;
int size=sc.nextInt();
int a[]=new int[size];
System.out.printf("Enter array element");
 for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("Enter value  delete:");
int index=sc.nextInt();

for(i=0;i<a.length;i++)
{
	if(a[i]==index)// //1 2 3 4 5
	{ 
		
		for(j=i;j<a.length-1;j++)
		{
	 		a[j]=a[j+1];
                        
		}		


	}
}

	for(i=0;i<a.length-1;i++)
	{
		System.out.printf("%d\t",a[i]);
	}
}
}