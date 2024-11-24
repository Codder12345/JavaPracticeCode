
 class Pattern2{
	 public static void main(String arg[]){
   int i,j;
    for(i=0;i<7;i++)
	{
		 for(j=0;j<13;j++)
		 {
			 if(j>=6-i&& j<13-i)
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