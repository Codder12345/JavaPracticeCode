import java.util.*;
   class  ZeroShiftRight
   {
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size");
           //int size=sc.nextInt();
         //   System.out.println("Enter array element:");
               int a[]=new int[]{0,1,1,0,1,1,0,1,0,0};
                  
                for(int i=0;i<a.length;i++)
                 {
                   for(int j=0;j<a.length;j++)
                   {
                     if(a[j]==1)
                     {
                      int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;
                     }
                   }
                  }     
           for(int i=0;i<a.length;i++)
           {
                System.out.print("\t"+a[i]);
           }               
                    
   }
   }
   
   
   
  