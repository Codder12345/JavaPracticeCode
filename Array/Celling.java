import java.util.*;
   class Celling{
    public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
      int i,ceil,floor;
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.printf("Enter array element");
      for(i=0;i<a.length;i++)
      {
       a[i]=sc.nextInt();
      }   
    System.out.printf("Enter  celling elemnet");
    int n=sc.nextInt();
     
   for(i=0;i<a.length;i++)
    {
      if(a[i]<n &&a[i+1]>n) 
      {
        ceil=a[i];
        floor=a[i];
       }
    }
   System.out.print(ceil);
   System.out.print(floor);
  }
}