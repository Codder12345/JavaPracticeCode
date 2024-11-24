import java.util.*;
   public class ArmstrongNumber{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
            int no=sc.nextInt();
           int count=0,sum=0,rem=0;
           int temp=no;
          while(no!=0)
          {
                no=no/10;
                count++;
          }
          no=temp;
          while(no!=0)
          {
           rem=no%10;
            int p=1;
           for(int i=1;i<=count;i++)
           {
             p=p*rem;
           }
           sum=sum+p;
            no=no/10;
          }
          no=temp;
          
          if(sum==no)
          {
          System.out.println("Armstrong");
          }
          else{
           System.out.println("not");
          }
        //  System.out.println("revers is"+rev);
         // String s=(rev==temp)?"Palindrom":"not palindrom";
          //System.out.println(s);
       }      
   }