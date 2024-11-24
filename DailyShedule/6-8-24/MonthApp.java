/*
12.Write a C program to input month number and print number of days in that month.
*/
  import java.util.*;
    class MonthApp{
      public static void main(String arg[])
      {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter month no:");
          int no=sc.nextInt();
           
           switch(no)
           {
            case 1:
            System.out.println("January 31 Days.");
            break;
            case 2:
            System.out.println(" February 28/29 Days.");
            break;
            case 3:
            System.out.println("March 31 Days.");
            break;
            case 4:
            System.out.println("April 30 Days.");
            break;
            case 5:
            System.out.println("May 31 Days.");
            break;
            case 6:
            System.out.println("Jun 30 Days.");
            break;
            case 7:
            System.out.println("Jully 31 Days.");
            break;
            case 8:
            System.out.println("August 31 Days.");
            break;
            case 9:
            System.out.println("September 30 Days.");
            break;
            case 10:
            System.out.println("October 31 Days.");
            break;
            case 11:
            System.out.println("November 30 Days.");
            break;
            case 12:
            System.out.println("December 31 Days.");
            break;
            default:
            System.out.println("Invalid month.");
              break;
           }
         }
   }