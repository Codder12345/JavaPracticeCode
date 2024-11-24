import java.util.*;
  class Employee{
      private String name;
      private int id;
      private int sal;
      private int progress;
      private int psal;
       
      void  setPersonalInfo(String name,int id,int sal)
       {
          this.name=name;
          this.id=id;
          this.sal=sal;
       }
       void setProgressPer(int Progress)
       {
            this.progress=progress;
         if(Progress>60)
         {
           psal=sal*30/100;
         }
       }
        void show()
        {
         System.out.println(name+"\t"+id+"\t"+sal+"\t"+psal);
        }
   }
    
  public class AreaEmpApp{
     public static void main(String arg[])
     {
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter name id and basic salary of Employee:");
          String name=sc.nextLine();
           int id=sc.nextInt();
           int sal=sc.nextInt();
           System.out.println("Enter progress value");
           int pro=sc.nextInt();
           
           Employee e=new Employee();
           e.setPersonalInfo(name,id,sal);
           e.setProgressPer(pro);
           e.show();
           
     }
  }