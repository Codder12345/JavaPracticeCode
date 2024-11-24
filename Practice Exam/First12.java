public class First12
{
    public static void main(String x[])
    {   
        int a[]={1,2,3,4,5};
	int i,j,k;
        i=j=k=0;
	a[i]=a[i<<1]+10;
	a[j+1>>1]=a[i]*20;
	System.out.println("Display array");
	for(i=0;i<a.length;i++)
	{ System.out.printf("%d\t",a[i]);
	}
    }
    
}
