class Student
{
   int id;
   String name;
   int marks[];
   void setId(int id)
   { 
      this.id=id;
   }
   void setName(String name)
   {
      this.name=name;
   }
   void setMarks(int m[])
   {
      marks=m;
   }
   int getId()
   {
      return id;
   }
   String getName()
   {
     return name;
   }
   int [] getMarks()
   {
      return marks;
   }
}
class FindPer
{
   Student s;
   
   void setStudent(Student s1)
   {
      s=s1;
   }
   void showStudent()
   {   int per=0;
       int m[]=s.getMarks();
       for(int i=0;i<m.length;i++)
       {
         per=per+m[i];
       }
       per=per/m.length;
       System.out.print("Id:"+s.getId()+"\tName:"+s.getName()+"\tPercentage:"+per);
   }
}
public class Per
{
   public static void main(String []x)
   {
       int a[]=new int[]{98,97,96,84,79};
       Student s=new Student();
       s.setId(1);
       s.setName("Don");
       s.setMarks(a);
       FindPer f=new FindPer();
       f.setStudent(s);
       f.showStudent();
   }
}