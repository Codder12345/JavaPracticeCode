/*
Q5. Write  Program to perform method overriding you have to create class name as ArrParent with 
method  
void setValue(int arr[]): this method can accept array as parameter  
void arrangeSeq(): this method can display array as per user input sequence 
You have to create two child class name as ArrangeAscendingOrder and you have to inherit 
ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and 
display in ascending order and you have to create one more class name ReverseArray and override 
arrangeSeq() method from ArrParent and reverse array and display it
*/
import java.util.*;
    class ArraParent{
   int a[];
   void setValue(int arr[])
   {
    a=arr;
   }
   void  arrangeSeq(){
    System.out.println("i am pooja");
   }
      
   }
  class   ArrangeAscendingOrder  extends ArraParent{
       void arrangeSeq()
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
        for( int i=0;i<a.length;i++)
        {
         System.out.printf("\t"+a[i]);
        }
        System.out.println();
       }
   }
   class  ReversArray extends ArraParent{
         void arrangeSeq()
         {
              int mid=a.length/2;
              int end=a.length-1;
              for(int i=0;i<mid;i++)
 
              {
                        int temp=a[i];
                        a[i]=a[end];
                        a[end]=temp;
                        end--;
              }                  
             
           for(int i=0;i<a.length;i++)
           {
            System.out.printf("\t"+a[i]);
           }
           
         }
    }
     public class ArraParentApp{
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
                                    
             ArrangeAscendingOrder a1=new ArrangeAscendingOrder();
             a1.setValue(a);
             a1.arrangeSeq();
             ReversArray r=new ReversArray();
             r.setValue(a);
             r.arrangeSeq();
                 
                 
        }
    }
   