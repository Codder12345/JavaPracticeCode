/*
: WAP to FindMissingElement with two methods 
void setArray(int a[]): this method can accept array as parameter 
void showMissing(): this method can find the missing element of array.
*/

class MissingElement{
   private int  a[];
   
   public void setArray(int a[])
   {
   this.a=a;
   }
   public void showArray()
   {
      for(int i=0;i<a.length-1;i++)
      {
       for(int j=a[i];j<(a[i+1]-1);)
       {
           System.out.printf("%d \t",++j);
       }
      }
   }
}
public class MissingApp{
public static void main(String arg[])
{
  int a[]=new int[]{0,1,3,4,5,6,7,9};
  MissingElement m=new MissingElement();
    m.setArray(a);
    m.showArray();
  
}
}