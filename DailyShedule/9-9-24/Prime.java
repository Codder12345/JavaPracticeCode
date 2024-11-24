import java.util.*;
   public class Prime{
     public static void main(String arg[])
     {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
         int no=sc.nextInt();
          int count=0;
             for(int i=1;i<=no;i++)
             {
                 if(no%i==0)
                 {
                     count++;
                     continue;
                 }
             }
             
          if(count==2)
          {
         System.out.println("Prime");
          }
          else{
            System.out.println("Not");
          }
     }
   }