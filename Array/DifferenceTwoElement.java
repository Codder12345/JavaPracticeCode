import java.util.*;
class  DifferenceTwoElement{
  public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
      int i,j;
     System.out.printf("Enter size of array:");
     int size=sc.nextInt();
     System.out.printf("Enter array element:");
      int a[]=new int[size];
     for(i=0;i<a.length;i++)
     {
      a[i]=sc.nextInt();
      }
  for(i=0;i<a.length;i++)
     {
     System.out.printf("%d \t",a[i]);
      }
       System.out.printf("Enter  value  for find difference::");
        int di=sc.nextInt();
        
      
        for(i=i;i<a.length;i++)
        {
            
          for(j=i+1;j<a.length;j++)
             {
               if(a[i]-a[j]==di)
              {
                  
                break;
               }
           }
             

         }
         
          
   }
 }
 