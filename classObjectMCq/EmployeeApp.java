 import java.util.*;
   class Employee
   {
     int  id;
     String name;
     int sal;
     
      public void setId(int id)
      {
        this.id=id;
      }
      public void setName(String name)
      {
        this.name=name;
      }
      public void setSal(int sal)
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
   
  public class EmployeeApp{
     public static void main(String arg[])
     {
        Scanner sc=new Scanner (System.in);
       
           Employee e[]=new Employee[5];
           
            System.out.println("Enter Data of Employee Id Name Sal");
        
           for(int i=0;i<e.length;i++)
           {
           

          
             e[i]=new Employee();
             
             e[i].setId(sc.nextInt());
             sc.nextLine();
             e[i].setName(sc.nextLine());
             e[i].setSal(sc.nextInt());
             
             
     }
               
        for(int i=0;i<e.length;i++)
            
            {
                  
        System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
            }
            
              System.out.println("Enter id for delete:");
                int del=sc.nextInt();
            
               for(int i=0;i<e.length-1;i++)
            
            {
                  
              if(e[i].getId()==del)
              {
                    for(int j=i;j<e.length-1;j++)
                    {
                         e[j]=e[j+1];
                    }                        
                   
              }
            }
              for(int i=0;i<e.length-1;i++)
            
            {
                  
              System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
            }
            
     }
   }