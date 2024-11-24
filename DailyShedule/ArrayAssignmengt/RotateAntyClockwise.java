import java.util.*;
    class RotateAntyClockwise{
        public static void main(String arg[])
        {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter array size:");
           int size=sc.nextInt();
            System.out.println("Enter array element:");
               int a[]=new int[size];
                 for(int i=0;i<a.length;i++)
                 {
                   a[i]=sc.nextInt();
                 }
              for(int j=0;j<a.length;j++)
              {
                 System.out.println("Enter value of k Rotate:");
                  int k=sc.nextInt();
                  int b[]=new int[a.length];
                  int c=0;
                  
                  for(int i=k;i<a.length;i++)
                   {
                     b[c++]=a[i];
                   }             
                    for(int i=0;i<k;i++)
                   {
                     b[c++]=a[i];
                   }
                   for(int i=0;i<a.length;i++)
                   {
                    System.out.print(b[i]);
                   }
                   System.out.println();
                   
              }
                

                   
                    
               
        }
    }