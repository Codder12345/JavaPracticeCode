import java.util.*;
class Employee
{  private int id;
   private String name;
   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
    return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
    return name;
   }
} 
public class EmployeeApp
{
   public static void main(String ...x)
   {
         Scanner sc=new Scanner (System.in);
        // int id=sc.nextInt();
         //String name=sc.nextLine();
	Employee e = new Employee();
	e.setId(1);
	e.setName("pooja");
	int empid=e.getId();
	String empName=e.getName();
	System.out.println(empid+"\t"+empName);
   }
}
