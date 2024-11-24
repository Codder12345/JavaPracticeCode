
//Q1. Draw the following pattern Palindrom number?
 
   

class Pattern1{
    public static void main(String arg[])
	{
	  int i,j;
	  for(i=1;i<=5;i++)
	   {
	     for(j=1;j<=10;j++)
		 {
		  if(j>5-i &&j<5+i  ) 
		  {
		 
                        System.out.printf("%d",i);
                    
                   
		    }
                  else{
                      System.out.printf(" ");
                  }
		 }
		 System.out.println();
	    }
		
	}
}
 