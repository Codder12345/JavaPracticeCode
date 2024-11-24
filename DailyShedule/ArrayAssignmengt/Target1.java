import java.util.*;
  class Target1{
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
            System.out.println("Enter target no");
            int no=sc.nextInt();
            for(int i=0;i<a.length;i++)
            {
                  int sum=0;
                 for(int j=i;j<a.length;j++)
                 {
                      sum=sum+a[j];
                     if(sum==no)
                     {
                          System.out.println("["+i+"\t"+j+"]");
                     }
                 }
            }
    }
  }