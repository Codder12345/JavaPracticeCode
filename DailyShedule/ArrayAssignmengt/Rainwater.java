import java.util.Scanner;
 class Rainwater{
    public static void main(String arg[]){
      Scanner sc=new Scanner (System.in);
       System.out.println("Enter array:");
      
        int size=sc.nextInt();
           System.out.println("Enter array element:");
             int a[]=new int[size];
              
          int sum=0;
           for(int i=0;i<a.length;i++)
         {
             
         a[i]=sc.nextInt();
         }
         System.out.println();
         for(int i=0;i<a.length;i++)
         {
          sum=sum+a[i];
         }
         System.out.println(sum);
 }     
     
 }