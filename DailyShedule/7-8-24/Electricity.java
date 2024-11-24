import java.util.*;
   class Electricity{
  public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter Unit:");
        float  unit=sc.nextInt();
         float tot=0;
         if(unit<50)
        { 
          tot=unit*0.50f;
          System.out.println(tot);
        }         
        else if(unit>50 &&unit<150)
        {
          tot=50*0.5f+(unit-50)*0.75f;
          System.out.println(tot);
        }
        else if(unit>150 && unit<250)
        {
         tot=50*0.5f+100*0.75f+(unit-150)*1.2f;
         System.out.println(tot); 
        }
        else if(unit>250)
        {
            tot=50*0.5f+100*0.75+100*1.2f+(unit-250)*1.5f;
             System.out.println(tot);
        }
        else{
            System.out.println("Envalid unit:");
        }
        float addbill=tot*(tot*20/100);
        System.out.println("total additional bill="+addbill);
   }
  }