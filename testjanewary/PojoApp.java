   /*
 __________________________________________________________________________________
Q1. WAP to Create POJO class name as Employee with field id, name and salary and create array of object of size 5 and 
store data in employee objects and display it and input the id from keyboard and search employee data by using
 its id and if id found then display message employee is present otherwise show employee not present.
 
*/    

   	 
	   import java.util.*;
	    class POJO {
			         
					 private int id,sal;
					 private char ch[];
					 
					  void setValue(int id1,int sal1,char ch1[])
					  {
						  id=id1;
						  sal=sal1;
						  ch=ch1;
					  }
					void Show()
					{
						 
						for(int i=0;i<3;i++)
				    {
					   id=sc.nextInt();
					   ch=sc.toCharArry();
                       sal=sc.nextInt();
					 
					}
						  for(int i=0;i<3;i++)
				    {
					      System.out.println(id);
					      System.out.println(ch);
						  System.out.println(sal);
					   
					 
					}
					}
		      
		 }
		  public class PojoApp{
			   public static void main(String arg[]){
			     Scanner sc=new Scanner (System.in);
			        int id,
				     String s=sc.nextLine();
				     char ch=s.toCharArry();
				   
			 
				   POJO p=new POJO();
				    p.setValue(id,ch,sal);
					p.Show();
			   }	
		   }