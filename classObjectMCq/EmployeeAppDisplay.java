  import java.util.*;
    class Employee{
       int id;
         String name;
         int sal;
         public void setID(int id)
        {
         this.id=id;
        }
         public void setName(String name)
        { 
         this.name=name;
        }
        public  void setSal(int sal)
        {
         this.sal=sal;
        }
        
        public  int  getID()
        {
         return id;
        }
         public  String  getName()
         {
          return name;
         }
        public  int  getSal()
         {
         return sal;
         }
         
    }
    
     public class EmployeeAppDisplay{
        public static void main(String arg[])
        {
          Scanner sc=new Scanner(System.in);
             Employee e[]=new Employee[5];
           for(int i=0;i<e.length;i++)
           {
            e[i]=new Employee();
            System.out.println("Enter id:");
            e[i].setID(sc.nextInt());
            System.out.println("Enter name:");
               sc.nextLine();
             e[i].setName(sc.nextLine());
              System.out.println("Ente sal:");
                e[i].setSal(sc.nextInt());
           }
           for(int i=0;i<e.length;i++)
           {
			   if(int j=i+1;j<a.length;j++)
			   {
				    if(a[i].getID()>a[j].getID())
					{
						 Employee temp=a[i];
						 a[i]=a[j];
						 a[j]=temp;
					}
			   }
           }
		   for(int i=0;i<a.length;i++)
		   {  System.out.println(e[i].getID()+"\t"+e[i].getName()+"\t"+e[i].getSal());
		   }
            
            
        }
      }
    
    