  import java.util.*;
    class Median{
       public static void main(String arg[])
       {
          Scanner sc=new Scanner(System.in);
             System.out.println("Enter array  size:");
               int size=sc.nextInt();
                 System.out.println("Enter array element:");
                   int a[]=new int[size];
                 
                   for(int i=0;i<a.length;i++)
                   {
                     a[i]=sc.nextInt();
                     
                   }
                     System.out.println("Enter array  size:");
                    int size1=sc.nextInt();
                   System.out.println("Enter array element:");
                     int b[]=new int[size1];
                   for(int i=0;i<b.length;i++)
                   {
                     b[i]=sc.nextInt();
                    
                   }
                   //System.out.println(c);
                    int c=0;
                   int d[]=new int[a.length+b.length];
                   for(int i=0;i<a.length;i++)
                   {
                    d[c++]=a[i];
                   
                   }
                    for(int i=0;i<b.length;i++)
                   {
                      d[c++]=b[i];
                   }
                  
                      for(int i=0;i<d.length;i++)
                   {
                      System.out.print(d[i]+"\t");
                   }
                   
                  double mid=d.length/2;
                  System.out.println("median is="+mid);
                   
                    
                   
                   
                   
                   
                   
                   
       }
       
    }