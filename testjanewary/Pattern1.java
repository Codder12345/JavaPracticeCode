
//Q1. Draw the following pattern?
 
   

class Pattern1{
    public static void main(String arg[])
	{
	  int i,j;
	  for(i=0;i<11;i++)
	   {
	     for(j=0;j<11;j++)
		 {
		  if(j>=6-i&&j<=4+i)
		  {
		    System.out.printf(" ");
		  }
		  else{
		     System.out.printf("*");
		  }
		 }
		 System.out.println();
	    }
		
	}
}
 