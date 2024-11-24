import java.util.*;
   
 class Power{
    int base,index;
   
   void SetValue(int a,int b)
  {
   base=a;
   index=b;
  } 

   void ShowPower() 
  {
    int p=1;
    for(int i=1;i<=index;i++)
    {
      p=p*base;
    }
   System.out.printf("Power is %d",p);
  }

  }
  public class AppPower{
  
   public static void main(String arg[])
    
   {
    Scanner sc=new Scanner (System.in);
     System.out.printf("Enter base and index value:");
    int base=sc.nextInt();
    int index=sc.nextInt();
    Power p=new Power();
    p.SetValue(base,index);
    p.ShowPower();
   }
  }
