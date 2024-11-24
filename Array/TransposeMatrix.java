import java.util.*;
class TransposeMatrix{
  public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
      //System.out.printf("Enter array size"); 
      int a[][]=new int[2][2];
      System.out.printf("Enter array element");
       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a.length;j++)
        {
         a[i][j]=sc.nextInt();
         }
       }
       
     System.out.printf("Display Array\n");
       
     for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a.length;j++)
        {
         System.out.print(a[i][j]);
        
         }
          System.out.println();
         
       }
   
    
     for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a.length;j++)
        {
            int sum=0;
         sum=sum+a[i][j];
         System.out.print(sum);
         }
          
          System.out.println();
        
         
       }
     
      
     
          
  }
}