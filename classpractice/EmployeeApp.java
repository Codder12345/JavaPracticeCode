import java.util.*;
  class Employee{
       private int id;
       private String name;
       private int sal;
       
       public void setID(int id)
        {
         this.id=id;
        }
        public int getID()
        {
           return id;
        }
       public void setName(String name)
         {
           this.name=name;
          }         
         public String getName()
         {
          return name;
         }
       public void setSal(int sal)
        {
          this.sal=sal;
         }        
        public int getSal()
        {
         return sal;
         }        
  }
  
  public class EmployeeApp{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
     int a[]=new int[5];
      
       Employee emp[]=new Employee[a.length];
     
          for(int i=0;i<a.length;i++)
          {
            emp[i]=new Employee();
            int  id=sc.nextInt();
            emp[i].setID(id);
             String name=sc.next();
             emp[i].setName(name);
             int sal=sc.nextInt();
             emp[i].setSal(sal);
          }
           for(int i=0;i<a.length;i++)
           {
            System.out.println(emp[i].getID()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
           }
           
           System.out.println("Enter delete id for user:");
            int did=sc.nextInt();
            
            for(int i=0;i<a.length;i++)
            {
                 if(a[i]==did)
                 {
                      for(int j=i;j<a.length;j++)
                      {
                           a[j+1]=a[j];
                      }
                 }
            }
          
    }
   }