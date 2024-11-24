import java.util.*;
class Employee{
   int id;
   String name;
   int totworking;
   int sal;
   void setDetails(int id,String name,int totworking,int sal,int overtime)
   {
      this.id=id;
      this.name=name;
      this.totworking=totworking;
      this.sal=sal;
      
              
   }
  void DisplyaInformation()
   {
    
   }    
     
 }
   class OverTime
   {
       Employee emp;
     void setEmployee(Emplyoee emp)
     {
      this.emp=emp;
     }
     
    void calculateOverTime()
      {
           
          int overtime=totworking-8;
         System.out.println("OverTime is="+overtime);
       }      
   }
   public class EmployeeApp{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter id name totworking salary overtim");
      int id=sc.nextInt();
      String name=sc.next();
      int totworking=sc.nextInt();
      int salary=sc.nextInt();
    
      
      Employee e=new Employee();
      e.setDetails(id,name,totworking,salary);
     
      
    
             
      
    }
   }