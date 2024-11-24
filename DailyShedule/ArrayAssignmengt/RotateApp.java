import java.util.*;
  class RotateClock{
     int a[];
     public void  setArray(int a[])
     {
      this.a=a;
     }
     public void show()
     {
         Scanner sc=new Scanner(System.in);
          int b[]=new int[a.length];
          int k=0;
       System.out.println("Enter value for rotate array:");
        int r=sc.nextInt();
       for(int i=r;i<a.length;i++)
       {
        b[k]=a[i];
        k++;
       }
       for(int i=0;i<r;i++)
       {
        b[k]=a[i];
        k++;
       }
       for(int i=0;i<b.length;i++)
       {
        System.out.printf(b[i]+"\t");
       }
     }
  }
  public class RotateApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size:");
      int size=sc.nextInt();
      int a[]=new int[size];
       System.out.println("Enter array element");
        for(int i=0;i<a.length;i++)
        { 
          a[i]=sc.nextInt();
        }
        
        RotateClock r=new RotateClock();
        r.setArray(a);
        r.show();
    }
  }