import java.util.*;
class Substraction{
public static void main(String arg[])
{
  Scanner sc=new Scanner (System.in){
    System.out.printf("Enter array size:");
     int size=sc.nextInt();
   int a[][]=new int[2][2];
   int b[][]=new int[2][2];
     System.out.printf("Enter array element:");
     for(i=0;i<a.length;i++)
    {
    for(j=0;j<a.length;j++)
    { 
      a[i][j]=sc.nextInt();
     }
    }
       System.out.printf("Enter array element:");
       for(i=0;i<a.length;i++)
    {
    for(j=0;j<a.length;j++)
    { 
         b[i][j]=sc.nextInt();
     }
    }
      for(i=0;i<a.length;i++)
    {
    for(j=0;j<a.length;j++)
    { 
      System.out.println(a[i][j]+b[i][j]);
     System.out.printf("\t");
     }
    }

}
}
}