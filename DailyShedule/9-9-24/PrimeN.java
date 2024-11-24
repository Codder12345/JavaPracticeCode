import java.util.*;
 public class PrimeN{
   public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Range:");
	 int n=sc.nextInt();
	 
	for(int i=1;i<n;i++)
	{
	    int count=0;
	    int temp=i;
		
	  for(int j=1;j<=temp;j++ )
	  {
	    if(i%j==0)
         {
		  count++;
         }	
       		 
	  }
	  if(count==2)
	  {
	   System.out.println(i);
	  }
	 
	}
   }
 }