import java.util.*;
 class Employee
 {
  String name,jobtit;
  int sal;
  public void setAttiribute(String name,String jobtit,int sal)
  {
   this.name=name;
   this.jobtit=jobtit;
   this.sal=sal;
   
  }
  public void UpdateSal()
  {
    Scanner sc=new Scanner(System.in);
   System.out.println(" Nmae"+"\tjobtit\t "+"sal ");
   System.out.println(name+"\t"+jobtit+"\t"+sal);
   System.out.println("Enter new Salary:");
   int newsal=sc.nextInt();
   int sal=newsal;
    System.out.println("Salary Update:");
   System.out.println(" Nmae"+"\tjobtit\t "+"sal ");
   System.out.println(name+"\t"+jobtit+"\t"+sal);


  }
 }
 public class EmployeeApp
 {
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee Name jobtitle and sal");
	String name=sc.nextLine();
	String jobtit=sc.nextLine();
	int sal=sc.nextInt();
	Employee e1=new Employee();
	e1.setAttiribute(name,jobtit,sal);
	e1.UpdateSal();
  }
 }