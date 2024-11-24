import java.util.*;
  class  ArrayOperation{
      int a[];
      void perfornoperation(int a[])
      {
        this.a=a;
     }
 }
 class Sort extends ArrayOperation{
    
    void SortArray()
    {
       for(int i=0;i<a.length;i++)
       {
         for(int j=i+1;j<a.length;j++)
         {
           if(a[i]>a[j])
           {
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;               
           }               
         }             
       }  
      }
      void show()
      {
          System.out.println("\n Display Sorted Array:");
           for(int i=0;i<a.length;i++)
           {
                System.out.print("\t"+a[i]);
           }
      }
 }
 class Insertion extends ArrayOperation{
      int index,value;
      
    void InsertArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" \nEnter value for insert");
        value=sc.nextInt();
        System.out.println("Enter index:");
         index=sc.nextInt();
        for(int i=0;i<a.length-1;i++)
        {
              if(i==index)
              {
               a[i]=value;             

              }
         }
       
        for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
 }
 class Deletion extends ArrayOperation{
     void DeleteArray()
     {
          Scanner sc=new Scanner(System.in);
         
         System.out.println("\n Enter value for delete");
           int value=sc.nextInt();  
         for(int i=0;i<a.length-1;i++)
         {
           if(a[i]==value)
           { 
             a[i]=a[i+1];     
           }
         }  
          for(int i=0;i<a.length-1;i++)
           {
               System.out.print("\t"+a[i]);
          }            
     }
 }
 public class ArrayOperationApp{
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
            Sort  s=new Sort ();
            s.perfornoperation(a);
            s.SortArray();
            s.show();
            Insertion  I=new Insertion();
            I.perfornoperation(a);
            I.InsertArray();
            Deletion d=new Deletion();
            d.perfornoperation(a);
            d.DeleteArray();
            
        
              
       }
 }