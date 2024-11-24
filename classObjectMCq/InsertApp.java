 
 import java.util.*;
   class InsertArrEle{
     int a[];
     void setArray(int a[])
     {
       this.a=a;
     }
       void insertValueOnIndex(){
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter index:");
            int index=sc.nextInt();
            System.out.println("Enter value");
             int value=sc.nextInt();
               for(int i=a.length-2;i>=index;i--)
               {
                  a[i+1]=a[i];
               }
               a[index]=value;
               
               for(int i=0;i<a.length;i++)
               {
                     System.out.println(a[i]);
               }
        }
        
     
   }
   public class InsertApp{
    public static void main(String ...x)
    {
        Scanner sc=new Scanner (System.in);
          System.out.println("Enter Array size");
           int size=sc.nextInt();
         int a[]=new int[size];
         System.out.println("Enter arrray element");
           for(int i=0;i<a.length-1;i++)
           {
             a[i]=sc.nextInt();
           }
           InsertArrEle e=new InsertArrEle();
             e.setArray(a);
             e.insertValueOnIndex();
             
           
    }
   }