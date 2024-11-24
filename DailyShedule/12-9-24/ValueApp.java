/*
Q6. Write Program to create abstract class name as Value with one abstract and one non abstract 
method  
void setValue(int ,int): this is non abstract method with two parameter  
abstract int getResult(): this is abstract method  
and you have two child class name as Power and you have to override getResult() method in Power 
class and calculate power of two values and return it as well as SearchDigit and you have to override 
getResult() consider first parameter of setValue() is number and second parameter is digit and you 
have to search digit in number and return it and if digit not found return -1
*/
import java.util.*;
  abstract class  Value{
     int no,digit;
       void setValue(int no,int digit)
       {
         this.no=no;
         this.digit=digit;
       }
     abstract int getResult();     
  }
 class Power extends Value{
      int getResult()
      {
         int temp=no;
        while(no!=0)
        {
          no=no/10;
          count++;
        }
        for(int i=1;i<=count;i++)
        {
         int p=p*temp;
        }
        return p;
        
      }
 }
 class SearchDigit extends Value{
     int getResult()
     {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter skey");
         int skey=sc.nextInt();
         int rem=0,f=0;
         while(digit!=0)
         {
          rem=no%10;
          no=no/10;
          if(rem==skey)
          {
            f=1;
          }
         }
         if(f==1)
         {
          System.out.println("Digit found.");
         }
         else{
          System.out.println("-1");
         }
     }
 }
 public class ValueApp{
     public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter number and digit:");
          int no=sc.nextInt();
           int digit=sc.nextInt();
           Power p1=new Power();
           p1.setValue(no);
           p1.getResult();
           
         SearchDigit s=new SearchDigit();
         s.setValue(digit);
         s.getResult();         
           
           
           
      }      
   }
 
  
  