
  import java.util.*;
  
    class Sum
   {
    
          
          void CalSum(int ...x)
          {
             int sum=0;
             for(int i=0;i<x.length;i++)
             {
                  sum=sum+x[i];
             }
             System.out.println("Sum is:"+sum);
          }
        
    }
      
    public  class SumApplication{
        public static void main(String arg[])
          {
             Scanner sc=new Scanner (System.in);
              System.out.println("Enter size");
               int size=sc.nextInt();
               int a[]=new int[size];
               for(int i=0;i<a.length;i++)
               {
                  a[i]=sc.nextInt();
                }
               Sum s=new Sum();
                s.CalSum(a);          
           
         }
       
    }