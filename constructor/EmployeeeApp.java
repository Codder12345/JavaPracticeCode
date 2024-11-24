import java.util.*;
    class Employee{
            int id;
            String name;
            String Address;
          
          void  Employee(int id,String name,String Address)
           { 
            this.id=id;
            this.name=name;
            this.Address=Address;
           }
           
           void showEmployee()
           {
             
             System.out.print(id+"\t"+name+"\t"+Address);
           }
   }
  
   class Engineer extends Employee{
          private int sal;
       void   Engineer(int sal)
         {
          this.sal=sal;
         }
        void showEngineer()
           {
              System.out.print(sal);
           }
   }
   
   public class EmployeeeApp{
        public static void main(String arg[])
          {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter name and Address id of Employee");
          String name=sc.next();
          String Address=sc.next();
          int id=sc.nextInt();
          
         
            Employee emp=new Employee();
            emp.Employee(id,name,Address);
             Engineer e=new Engineer();
             System.out.println("Enter salary\t :");
             int sal=sc.nextInt();
             e.Engineer(900);
             emp.showEmployee();
             e.showEngineer();
          
                    
       }
   }