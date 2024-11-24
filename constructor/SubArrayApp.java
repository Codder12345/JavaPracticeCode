import java.util.*;
  class  SubArray{
    int a[],value;
     SubArray(int a[],int value)
     {
      this.a=a;
      this.value=value;
     }
     void FindSubArr()
     {
          int sum=0;
      for(int i=0;i<a.length;i++)
      {
           sum=a[i];
       for(int j=i+1;j<a.length;j++)
       {
          sum=sum+a[j];
         if(sum==value)
         {
             System.out.printf("["+i+"--"+j+"]"+"\t");   
            for(int k=i;k<=j;k++)
            {
              
             System.out.print(a[k]+" ");
            }
         }
       }
      }
     }
    
  }
  public class SubArrayApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter size");
       int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("Enter array");
         for(int i=0;i<a.length;i++)
         {
           a[i]=sc.nextInt();
         }
         System.out.println("Enter sum :");
          int sum=sc.nextInt();
         SubArray  s=new SubArray(a,sum);
           s.FindSubArr();
           
    }
  }