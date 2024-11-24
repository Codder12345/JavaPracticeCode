import java.util.*;
   class CheckDuck{
      int no;
       int rem=0,f=0;
      CheckDuck( int no)
      {
         this.no=no;
        while(no!=0)
        {
          rem=no%10;
          if(rem==0)
          {
           f=1;
           break;
          }
          no=no/10;
        }
        
      }
    boolean isDuckNumber()
    {
     if(f==1)
     {
      return true;
     }
     else{
      return false;
     }
    }
   }
   public  class DuckApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number of check:");
       int no=sc.nextInt();
        CheckDuck c=new CheckDuck(no);
        boolean res=c.isDuckNumber();
        System.out.prinln(res);
        
        }
   }
   