/*
21.Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill

*/

  import java.util.*;
    class Unit{
    public static void main(String arg[])
     { 
        Scanner sc=new Scanner (System.in);
          System.out.println("Enter unit for user:");
           int unit=sc.nextInt();
             float tot=0;
              if(unit<=50)
              {
               tot=unit*0.5f;
               System.out.println(tot);
               } else if(unit>50 && unit<=150)
                {
                 tot=50*0.5f+(unit-100)*0.75f;
                  System.out.println(tot);
                }else if(unit>150 && unit<=250)
                {
                 tot=50*0.5f+100*0.75f+(unit-150)*1.2f;
                  System.out.println(tot);
                }else if(unit>250)
                { 
                  tot=50*0.5f+100*0.75f+100*1.2f+(unit-250)*1.5f;
                   System.out.println(tot);
                }
                  
               
               
               
                      float bill=tot*(tot*20/100);
                      System.out.println(bill);
                  
                
      }
     }
 