import java.util.*;
class Student
{
   int a[];
    int per;
 void setSubMarks(int a[])
 {
   this.a=a;
 }
 void calculatePer()
  { 
      int sum=0;
     for(int i=0;i<a.length;i++)
   {
      sum=sum+a[i];
   } 
    
    per=sum/a.length;
   System.out.println("Total marks is :"+sum);  
    System.out.println("percentage is :"+per);  
  }
  
   void checkGrades()
   {
     if(per>60 && per<=70)
     {
      System.out.println("First Division");
     }
     else if(per>=50 && per<=60)
     {
       System.out.println("Second Division");
     }
     else if(per>40 && per<=50){
      System.out.println("Third Division");
     }
     else if(per<40){
      System.out.println("Fail");
      
     }
     else{
      System.out.println("Invalid percentage.");
     }
   }
 
}
public class StudentApp{
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter size");
     int size=sc.nextInt();
      int a[]=new int[size];
         System.out.println("Enter marks");
        for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt();
        }
        
          Student s=new Student();
           s.setSubMarks(a);
           s.calculatePer();
           s.checkGrades();
               
    }
 }