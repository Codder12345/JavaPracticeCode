import java.util.*;
 class StringApp
 {
  private String str;
   StringApp(String str)
   {
	this.str=str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Search character");
    char c=sc.next().charAt(0);
	int f=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<=ch.length;i++)
	{
		 if(ch[i]%2==0)
		 {
			 System.out.print(ch[i]+"\t");
		 }
    }
	for(int i=0;i<ch.length;i++)
	{
	  if(ch[i]==c)
	 {
	   f=1;
	   break;
	 }
	}
	
	if(f==1)
	{
	 System.out.println("character is present in the given string\t :"+c);
	}
	else{
	 System.out.println(" character is Not present int the given String:");
	}

   }
 }
 public class SearchStringApp
 {
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter String :");
   String str=sc.nextLine();
   StringApp s1=new StringApp(str);
   
  }
 }