/*Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
How to calculate electricity bill using if else in C programming. Program to find electricity bill using if else in C. Logic to find net electricity bill in C program.
*/

import java.util.*;
  class Ques13{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Unit");
          int unit=sc.nextInt();
            float t=0;
            if(unit>0 && unit<=50)
            {
             t=unit*0.05f;
            }            
            else if(unit>50 && unit<=150){
               t=(50*0.05f)+((unit-50)*0.75f);
             }
            else if(unit>150 && unit<250)
            {
             t=(50*0.05f)+(100*0.75f)+((unit-150)*1.2f);
            }            
            else if(250<unit) 
            {
             t=(50*0.5f)+(100*0.75f)+(100*1.2f)+((unit-250)*1.5f);
            }
            else
              System.out.println("Enter valid unit");
                System.out.println("Total bill:"+(t+(t*20/100)));
            
    }
  }