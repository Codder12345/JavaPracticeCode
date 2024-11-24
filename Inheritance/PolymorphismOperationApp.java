 import java.util.*;
 
  class performArrayOperation{
     int a[];
     void setArray(int a[])
     {
       this.a=a;
     }
    void show()
   {
     for(int i=0;i<a.length;i++)
     {
      System.out.print("\t"+a[i]);
     }
   }    
  }
  class AddElement extends performArrayOperation{
    
    void show()
    {
         Scanner sc=new Scanner(System.in);
      System.out.println("Enter value for add in the array");
       int value=sc.nextInt();
        System.out.println("Enter index where insert value");
         int index=sc.nextInt();
          
       for(int i=0;i<a.length;i++)
       {
        if(i==index)
        {
         a[i]=value;
        }
        a[index]=value;
       }
       for(int i=0;i<a.length;i++)
       {
        System.out.print("\t"+a[i]);
       }
    }
  }
 public class PolymorphismOperationApp{
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
         performArrayOperation p=new  AddElement ();
          p.setArray(a);
          p.show();
         
    }
   }