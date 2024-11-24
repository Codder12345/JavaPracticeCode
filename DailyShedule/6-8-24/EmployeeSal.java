/*
20.Write a C program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%

*/
import java.util.*;
  class EmployeeSal{
      public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary:");
        int sal=sc.nextInt();
        int HRA,DA,GS=0;
           if(sal<=10000)
           {
            DA=sal*80/100;
            HRA=sal*20/100;
            GS=sal+DA+HRA;
            
           }
           else if(sal>10000 && sal<=20000)
           {
            DA=sal*90/100;
            HRA=sal*25/100;
            GS=sal+DA+HRA;
            
           }
           else if(sal>20000)
           {
            DA=sal*95/100;
            HRA=sal*30/100;
            GS=sal+DA+HRA;
           }
           System.out.println("Gross Salary is ="+GS);
     }
  }