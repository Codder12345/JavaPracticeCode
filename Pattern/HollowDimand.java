import java.util.*;
/*
 class Dimand{
	 public static void main(String arg[]){
   int i,j,n=25;
    for(i=1;i<=n;i++)
	{
		 for(j=1;j<=n;j++)
		 {
		//	 if(j>=6-i&& j<=6+i && j>=i+1 && j<=13-i  )
			if(j>=((n/2)+2)-i && j<=((n/2)+i)&& i<=(n/2)+j)
			 {
				 System.out.printf("*");
			 }
			 else{
				 System.out.printf(" ");
			 }
		 }
		 System.out.println();
	}
 }
 } */
 
 
 class Dimand{
	 public static void main(String arg[]){
   int i,j,n,x;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter no of rows and cols:");
   n=s.nextInt();
   x=n/2+1;
    for(i=1;i<=n;i++)
	{
		 for(j=1;j<=n;j++)
		 {
		//	 if(j>=6-i&& j<=6+i && j>=i+1 && j<=13-i  )
			if(j>=x&&j<=n+x+1)
			 {
				 System.out.printf(" ");
			 }
			 else{
				 System.out.printf("*");
			 }
		 }
		 if(i>=n/2)
			 x++;
		 else
			 x--;
		 System.out.println();
	}
 }
 }