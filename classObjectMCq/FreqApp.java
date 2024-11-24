import java.util.*;
 class ArrayFeqCount{
   int a[];
   void setArray(int ch[])
   {
     a=ch;
   }
   
   void countFrqCount()
   {
       
     for(int i=0;i<a.length;i++)
     {
         int count=1;
       for(int j=i+1;j<a.length;j++)
       {
           if(a[i]==a[j])
           {
               count++;
               a[j]=-1;
           }
          
       }
       if(a[i]!=-1)
       {
            System.out.println(a[i]+"-->"+count);
       }
       }
   }
 }
 public class FreqApp{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter size:");
       int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("Enter array element:");
          for(int i=0;i<a.length;i++)
          {
             a[i]=sc.nextInt();
          }
          
          ArrayFeqCount f=new ArrayFeqCount();
          f.setArray(a);
          f.countFrqCount();
   }
 }