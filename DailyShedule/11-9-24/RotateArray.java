import java.util.*;
class RotateArray1
{
  public static int [] rotateClockWise(int a[],int k)
  {
      //k=k%a.length;s
      reverseArray(a,0,a.length);
      reverseArray(a,0,k);
      reverseArray(a,k,a.length);
     return a;
  }
  public static int [] rotateAntiClockWise(int a[],int k)
  {
     reverseArray(a,0,a.length);
     reverseArray(a,0,a.length-k);
    reverseArray(a,a.length-k,a.length);
    return a;
  }
  public static void reverseArray(int a[],int s,int k)
  { int i=s;
    int j=k-1;
    while(i<j)
    {
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      i++;
      j--;
    }
  }
  public static void main(String ...x)
  {
      int a[]=new int[]{1,2,3,4,5,6};
      int k=1;
      int ans[]=rotateClockWise(a,k);
      for(int i=0;i<a.length;i++)
      {
         System.out.print(ans[i]+" ");
      }
     System.out.println();
     int a1[]=new int[]{1,2,3,4,5,6};
      int k1=1;
     int ans1[]=rotateAntiClockWise(a1,k1);
      for(int i=0;i<a.length;i++)
      {
         System.out.print(ans1[i]+" ");
      }
     
  }
}