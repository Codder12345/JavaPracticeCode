import java.util.Scanner;
  abstract class ArrayPalindrom{
      int a[];
      void setArrya(int a[])
      {
       this.a=a;
      }
     abstract int checkPalindromArray(); 
  }
  class CheckArray{
        int rem=0,rev=0;
      int checkPalindromArray()
      {
       for(int i=0;i<a.length;i++)
       {
        rem=a[i]%10;
        rev=rev*10+rem;
        a[i]=a[i]/10;
       }
       System.out.println(rev);
      }
  }
  public class PalindromArrayApp{
   public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter array size");
       int size=sc.nextInt();
        int a[]=new int[size];
       System.out.println("Enter array element:");
       for(int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
       }
       CheckArray c=new CheckArray();
       c.setArrya(a);
       c.checkPalindromArray();
   }
  }