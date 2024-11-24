import java.util.*;
 class ArrayCons
 {
 private  int []a,b;
  ArrayCons(int a[])
  {
    this.a=a;	
  }
  ArrayCons(int a[],int b[])
  {
   System.out.println("Array");
   for(int i=0;i<a.length;i++)
   {
	    System.out.print(a[i]+"\t");
   }
  }
 }
 public class ArrayConsApp
 {
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array size:");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	for(int i=0;i<a.length;i++)
     {
	  a[i]=sc.nextInt();
     }    	 
	  System.out.println("Enter Array size:");
	 int size1=sc.nextInt();
	 int b[]=new int[size1];
	for(int i=0;i<b.length;i++)
     {
	 b[i]=sc.nextInt();
     }    	 
	ArrayCons a1=new ArrayCons(a);
   	ArrayCons a2=new ArrayCons(a,b);
	 
  }
 }