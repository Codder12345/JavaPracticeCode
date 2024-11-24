
//Q2. Draw the following pattern?
 
   

class Pattern{
    public static void main(String arg[])
	{
	  int i,j;
	  for(i=1;i<11;i++)
	   {
	     for(j=1;j<11;j++)
	   {
              if(j>i && j<12-i ||j<i && j>12-i)
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
}