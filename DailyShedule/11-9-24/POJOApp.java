/*
Q5. Write program to create POJO class name as Employee with id,name and salary attribute and 
store data in object and retrieve data from object
*/
import java.util.*;
  class POJO{
     int id;
     String name;
     int sal;
     void setID(int id)
     {
      this.id=id;
     }
     int getID()
     {
      return id;
     }
     void setName(String name)
     {
      this.name=name;
     }
    String getName()
    {
     return name;
    }
    void setSal(int sal)
    {
      this.sal=sal;
    }
    int getSal()
    {
     return sal;
    } 
    void Display()
    {
      System.out.println("Employee ID::"+id);
      System.out.println("Employee name:: "+name);
      System.out.println("Employee salary:: "+sal);
    }
  }
  public class POJOApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter Employee ID Name and salary:");
       int id=sc.nextInt();
        String name=sc.next();
         int sal=sc.nextInt();
         
       POJO p=new POJO();
       p.setID(id);
       p.setName(name);
       p.setSal(sal);
       p.Display();
              
     
    }
  }