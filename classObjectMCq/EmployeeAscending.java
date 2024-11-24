 import java.util.*;
   class  Employee{
       int id;
       String name;
        int sal;
       public  void setId(int id)
        {
         this.id=id;
        }
        
       public  void setName(String name)
        {
          this.name=name;
        }
       public  void setSal(int sal)
        {
         this.sal=sal;
        }
        public int getId()
        {
          return id;
        }
         public String getName()
         {
         return name;
         }
         public int getSal()
         {
          return sal;
         }
        
        
    }
    
    public class EmployeeAscending{
     public static void main(String arg[])
     {
      Scanner sc=new Scanner(System.in);
       
        Employee emp[]=new Employee[5];
       for(int i=0;i<emp.length;i++)
       {
          emp[i]=new Employee();
           emp[i].setId(sc.nextInt());
           sc.nextLine();
           emp[i].setName(sc.nextLine());
           emp[i].setSal(sc.nextInt());
       }
      
        System.out.println("ID \t Name\t Salary");
         System.out.println("____________________");
        for(int i=0;i<emp.length;i++)
      {
       System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
      }
      
        for(int i=0;i<emp.length;i++)
        {
          for(int j=i+1;j<emp.length;j++)
          {
               if(emp[i].getSal()>emp[j].getSal())
               {
                  Employee temp=emp[i];
                  emp[i]=emp[j];
                  emp[j]=temp;
               }
          }
      }
       System.out.println("____________________");
        System.out.println("ID \t Name \t  Salary");
         System.out.println("____________________");
        for(int i=0;i<emp.length;i++)
      {
       System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
      }
     }
    }