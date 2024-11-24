import java.util.*;
 class Salary{
    String name;
    int id;
    String contact;
    int pday;
    int pdaysal;
    int sal;
     Salary(int id,String name,String contact,int pday,int pdaysal)
    {
      this.name=name;
      this.id=id;
      this.contact=contact;
      this.pday=pday;
      this.pdaysal=pdaysal;
     }     
     void calculateSalary()
     {
        sal=pday*pdaysal;
     }
     void show()
     {
      System.out.println(id+"\t"+name+"\t"+contact+"\t"+pday+"\t"+pdaysal+"\t  salary is ="+sal);
     }
     
 }
 public class SalaryApp{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter id name contact presentday perdaysalary");
     int id=sc.nextInt();
     String name=sc.next();
     String contact=sc.next();
     int pday=sc.nextInt();
     int pdaysal=sc.nextInt();
     
     Salary s=new Salary(id,name,contact,pday,pdaysal);
     s.calculateSalary();
     s.show();
     
  }
 } 