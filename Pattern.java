public class Pattern
{
public static void main(String arg[]){
	int i,j;
	char ch='A';
	for(i=0;i<=5;i++)
	{
		for(j=1;j<=9;j++)
		{
		if(j>=6-i &&j<=4+i)
		{
		System.out.printf(" ");
		}
		else
		{
				
		System.out.printf("%c",ch++);
		}
			
		}
		ch='A';
		System.out.println();
	}
}
}