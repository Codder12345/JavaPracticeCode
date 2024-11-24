import java.util.*;
  class Abc{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        
          for(int i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();
          }
          
          for(int i=0;i<a.length;i++)
          {
           System.out.printf(""+a[i]);
          }
    }
  }