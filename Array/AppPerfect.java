import java.util.*;
  class PerfectNo{
     private int no;
        void SetNo(int x)
         {
           no=x;
         }
        void CalPerfect()
      {
          int sum=0;
         for(int i=1;i<no;i++)
        {
         if(no%i==0)
          {
         sum=sum+i; 
          }
       }
       if(no==sum)
        {
         System.out.printf("Number is perfect."); 
        }
       else{
         System.out.printf("Not perfect.");
        }
     }
  }
  public class Appperfect{
        public static void main(String arg[])
       {
        Scanner sc=new Scanner (System.in);
        System.out.printf("Enter number for check perfect or not:");
         int x=sc.nextInt();
           
        PerfectNo p=new PerfectNo();
        p.SetNo(x);
        p.CalPerfect();
            
       }
  }
