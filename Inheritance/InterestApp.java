import java.util.*;
 class Interest{
       int P,R,D;
       
      void setPRD(int p,int r,int d)
      {
       P=p;
       R=r;
       D=d;
      }
 }
 
 class CalInterest extends Interest{
     void calInterest()
     {
       int  I=P*R*D/100;
        System.out.println("Interest is"+I);
     }
 }
 public class InterestApp{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Principle amount rate ans Duration:");
   int p=sc.nextInt();
   int r=sc.nextInt();
   int d=sc.nextInt();
   
   CalInterest c1=new CalInterest ();
   c1.setPRD(p,r,d);
   c1.calInterest();
   
   
  }
 }