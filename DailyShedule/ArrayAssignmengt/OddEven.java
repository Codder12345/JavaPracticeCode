  import java.util.*;
    class OddEven{
      public static void main(String arg[])
       {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter array size:");
           int size=sc.nextInt();
            int a[]=new int[size];
            System.out.println("Enter array element:");
             for(int i=0;i<a.length;i++)
              {
                a[i]=sc.nextInt();
              }
              
              System.out.println("First even and second odd number :");
              
              for(int i=0;i<a.length;i++)
              {
               if(a[i]%2==0)
               {
                System.out.print("\t"+a[i]);
               }
              }
               for(int i=0;i<a.length;i++)
              {
               if(a[i]%2!=0)
               {
                System.out.print("\t"+a[i]);
               }
              }
            
       }
     }