import java.util.*;

class  InsertElement{
 public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
int a[]=new int[6];
int i;
System.out.printf("Enter array element");

for(i=0;i<5;i++)
{
    a[i]=sc.nextInt();//1 2 3 4 5
}
System.out.printf("Enter index =");
int index =sc.nextInt();//2
System.out.printf("Enter value=");
int value=sc.nextInt();//500

//1 2 3 500 4 5

for(i=a.length-2;i>=index;i--)
{
    
      a[i+1]=a[i];
   
}
   a[index]=value;

  for(i=0;i<6;i++)
  {
     System.out.print(a[i]);
     System.out.print("\t");
  }
 }
}