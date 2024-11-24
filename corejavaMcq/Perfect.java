import java.util.*;
  class Perfect{
   public static void main(String arg[])
   {
       Scanner sc=new Scanner (System.in);
       
         int no=sc.nextInt();
         int temp=no;
          int i=1,sum=0;
           while(i<no)
           {
             if(no%i==0)
             {
               sum=sum+i;
             }
             i++;
           }
           if(sum==temp)
           {
           System.out.println("no is perfect");
           }
           else{
             System.out.println("not  perfect");
           }
   }   
 }