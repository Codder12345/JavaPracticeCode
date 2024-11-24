import java.util.*;
 public  class SecondHighest
 {
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
	 System.out.println("Enter arry size:");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 int i;
	 System.out.println("Enter Array element:");
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
	   int max2=0;
	   for(int j=0;j<a.length;j++)
	   {
	    if( a[j]>max2 && a[j]<max)
		{
		  max2=a[j];
		}
	   }
	  System.out.println(" max:"+max);
	  System.out.println("second max"+max2);
  }
 }