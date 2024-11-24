/*
13.Write a C program to count total number of notes in given amount.
*/

import java.util.*;
  class NumberofNote{
      public static void main(String arg[])
      {
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter cash amount:");
           int cash=sc.nextInt();
           int no500=0,no200=0,no100=0,no50=0,no20=0,no10=0,no5=0,no2=0,no1=0;
           if(cash>=500)
           {
               no500=cash/500;
               cash=cash-no500*500;
               System.out.println("Remening amount  "+cash+"and 500 notes is-->"+no500);
           }
           if(cash>=200)
           {
               no200=cash/200;
               cash=cash-no200*200;
               System.out.println("Remening amount "+cash+"and 200 notes is-->"+no200);
           }
           if(cash>=100)
           {
               no100=cash/100;
               cash=cash-no100*100;
               System.out.println("Remening amount  "+cash+"and 100 notes is-->"+no100);
           }
           if(cash>=50)
           {
               no50=cash/50;
               cash=cash-no50*50;
               System.out.println("Remening amount id "+cash+"and 50 notes is-->"+no50);
           }
             if(cash>=20)
           {
               no20=cash/20;
               cash=cash-no20*20;
               System.out.println("Remening amount id "+cash+"and 20 notes is-->"+no20);
           }     
           if(cash>=10)
           {
               no10=cash/10;
               cash=cash-no10*10;
               System.out.println("Remening amount id "+cash+"and 10 notes is-->"+no10);
           }
           if(cash>=5)
           {
               no5=cash/5;
               cash=cash-no5*5;
               System.out.println("Remening amount id "+cash+"and 5 Doller is-->"+no5);
           }
           if(cash>=2)
           {
               no2=cash/2;
               cash=cash-no2*2;
               System.out.println("Remening amount id "+cash+"and 2 Dollers is-->"+no2);
           }
           if(cash>=1)
           {
               no1=cash/1;
               cash=cash-no1*1;
               System.out.println("Remening amount id "+cash+"and 1 Doller is-->"+no1);
           }
      }
        
  }