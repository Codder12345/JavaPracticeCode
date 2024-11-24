  /*
  Q3. WAP to Create class name as Product as POJO with field id,name and price create array of object of product of size 10 and find the product whose price is same.
  */
    import java.util.*;
      class Student{
          private int id;
          private String name;
          private int per;
          
         public void setID(int id)
         {
            this.id=id;
         }
         public int  getID()
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
        public void setPer(int per)
       {
          this.per=per;   
       }        
        public  int getPer()
        {
         return  per;
        }
      }
      
       public class StudentApp{
         public static void main(String x[])
         {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter size");
            int size=sc.nextInt();
             
             Student s[]=new Student[size];       
              for(int i=0;i<s.length;i++)
              {
                 s[i]=new Student();
                 System.out.println("Enter student id name and percentage:");
                  s[i].setID(sc.nextInt());
                  s[i].setName(sc.next());
                  s[i].setPer(sc.nextInt());
              }
              System.out.println("Enter id for search student:");
                int Sid=sc.nextInt();
              for(int i=0;i<s.length;i++)
              {
                if(s[i].getID()==Sid)
                {
                System.out.println(s[i].getID()+"\t"+s[i].getName()+"\t"+s[i].getPer());
                }
               }              
         }
         
       }