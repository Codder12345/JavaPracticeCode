import java.util.*;
 class MergeArray{
  
  public static void main(String arg[])
{
  Scanner sc=new Scanner (System.in);
    int size=sc.nextInt();
	 int i;
    int a[]=new int[size];
	  for(i=0;i<a.length;i++)
	  {
	   a[i]=sc.nextInt();
	  }
	  
	   int size1=sc.nextInt();
	 
     int b[]=new int[size1];
	  for(i=0;i<b.length;i++)
	  {
	   b[i]=sc.nextInt();
	  }
	  
	   int c[]=new int[a.length+b.length];
	   int k=0;
	    for(i=0;i<a.length;i++)
	  {
	     c[k++]=a[i];
	  }
	      for(i=0;i<b.length;i++)
	  {
	     c[k++]=b[i];
	  }
	  
	      for(i=0;i<c.length;i++)
	  {
	     System.out.printf("%d\t",c[i]);
	  }
	  
	   
	   
}  
 }