import java.util.*;
   class NextBiggestElement{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
       System.out.printf("Enter size");
      int size=sc.nextInt();
      int a[]=new int[size];
       int i,j;
      for(i=0;i<a.length;i++)
      {
       a[i]=sc.nextInt();
      }
        int b[]=new int[size];
       for(i=0;i<a.length;i++)
       { 
          b[i]=-1;
          for(j=i+1;j<a.length;j++)
           {
             if(a[j]>a[i])
            {
               b[i]=a[j];    
               break;
            }  
           }  
                
           System.out.printf("%d---->%d",a[i],b[i]);
            System.out.println();
       } 
          for(i=0;i<a.length;i++)
          {
           System.out.printf("%d \t",+b[i]);
           }
 
    }
  }