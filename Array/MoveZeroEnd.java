   

    import java.util.*;
       class MoveZeroEnd{
      public static void main(String arg[])
      {
        Scanner sc=new  Scanner(System.in);
         System.out.printf("Enter array size:");
          int i,j,temp;
          int size=sc.nextInt();
         int a[]=new int[size];
         System.out.printf("Enter array element:");
          for(i=0;i<a.length;i++)
          {
           a[i]=sc.nextInt();
           }
           
          for(i=0;i<a.length;i++)
          {
           for(j=i+1;j<a.length;j++)
           {
            if(a[i]==0)
           {
            temp=a[i];
             a[i]=a[j];
             a[j]=temp;
              }
            }
          }
              
          for(i=0;i<a.length;i++)
           {
            System.out.printf("%d \t",a[i]);
           }
       } 
  }