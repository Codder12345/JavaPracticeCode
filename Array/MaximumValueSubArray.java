import java.util.*;
class MaximumValueSubArray{
   public static void main(String arg[])
  {
   Scanner sc=new Scanner (System.in);
    System.out.printf("Enter size of array");
    int size=sc.nextInt();
     int i;
     int a[]=new int[size];
    System.out.printf("Enter  array element");
    for(i=0;i<a.length;i++)
    {
     a[i]=sc.nextInt();
    }
    
    for(i=0;i<a.length;i++)
    {
     System.out.printf("%d \t",a[i]);
        }
     System.out.printf("Enter  value start subarray and end ");
    int start=sc.nextInt();
    int end=sc.nextInt();
     int  max=0;
      for(i=start;i<=end;i++)
    {
      if(a[i]>max)
        {
         max=a[i];
         }
    }
     
     for(i=start;i<=end;i++)
      {
        System.out.printf("%d\t",a[i]);
        
      }
            System.out.printf("---->:%d ",max);

  }
}