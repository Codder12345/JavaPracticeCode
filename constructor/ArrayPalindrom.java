import java.util.*;
 class  ArrayPalindrom{
   public static void main(String arg[])
   {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter array size:");
     int size=sc.nextInt();
     System.out.println("Enter array element:");
      int a[]=new int[size];
      int i,j=0;
      for(i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }       
         int f=0;
       for( i=0;i<a.length;i++)           
          {
              for(j=a.length-1;j>0;j--){
               if(a[i]!=a[j])
               {
                  f=1;
                 break;              
               }
               
              }
              
          }
           if(f==1)
           {
            System.out.println("Array not palindrom:");
          }
          else
          {
              
                System.out.println("Array is Palindrom");
          }
   }
 }