
import java.util.*;
  public class SearchValue{
         public static void main(String x[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter array size:");
          int size=sc.nextInt();
           System.out.println("Enter array element:");
           int a[]=new int[size];
            for(int i=0;i<a.length;i++)
            {
            a[i]=sc.nextInt();
            }
            System.out.println("Enter serch value:");
            int skey=sc.nextInt();
            int f=0,i;
            for(i=0;i<a.length;i++)
            {
              if(a[i]==skey)
              {
                f=1;
                break;
              }
            }
            if(f==1)
            {
             
              System.out.println(i);
            }
            else{
            
             System.out.println("-1");
            }
         }
   }