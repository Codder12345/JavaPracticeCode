/*
Example: WAP to Create class name as Student with field id,name,marks[] with setter and getters means 
void setId(int): accept id as parameter
int getId(): return id as parameter
void setName(String name): this method can accept name as parameter
String getName(): return name as parameter
void setMarks(int marks[]): this method can accept marks of six subject 
*/
import java.util.*;

class  Student{
       private int id;
      private String name;
       private  int b[];
       
       public void setId(int id)
       {
       this.id=id;
       }
       
       public int getId()
       {
       return id;
       }
       public void setName(String name)
       {
          this.name=name;
       }
       public String getName()
       {
        return  name;
       } 
       public void setMarks(int b[])
       {
           this.b=b;
       }
         public int[] getMarks()
       {
           return b;
       }
       
}
class FindPer{
 private Student std;
    
   void setStudent(Student student)
   {
     std=student;
   }
   
   void showStudent()
   {
    System.out.println(std.getId()+"\t"+std.getName());
 
   }
   float getPer()
   {
       
         float  sum=0;
       for(int i=0;i<6;i++)
       {
          sum=sum+i;
       }
       float  per=sum/6;
        return per; 
   }
}

  public  class  StudentApp{
     public static void main(String arg[])
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Id is:");
        int id=sc.nextInt();
       // System.out.println("Enter name is:");
      //  sc.nextInt();
      //  String name=sc.nextLine();
        int a[]=new int[6];
         System.out.println("Enter six subject marks:");
        for(int i=0;i<6;i++)
         {
             a[i]=sc.nextInt();
         }
         FindPer f=new FindPer();
         Student s=new Student();
         s.setId(id);
         s.setName("pooja");
         s.setMarks(a);
         s.getId();
         s.getName();
         s.getMarks();
         
         f.setStudent(s);
         f.showStudent();
         float res=f.getPer();
         System.out.println("percentage is:"+res);    
         

     }
  }
