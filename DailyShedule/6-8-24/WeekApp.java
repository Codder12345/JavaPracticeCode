/*
11.Write a C program to input week number and print week day.
*/
 import java.util.*;
  class WeekNumber{
     int no;
     public void setNo(int no)
     {
      this.no=no;
     }
    
     public void DisplayDay()
     {
         switch(no)
          {
         case 1:
         System.out.println("1 Sunday.");
         break;
         case 2:
         System.out.println("2 Monday.");
         break;
          case 3:
         System.out.println("3 Tuesday.");
         break;
         case 4:
         System.out.println(" 4 Wednesday");
         break;
          case 5:
          System.out.println("5 Thusday.");
          break;
         case 6:
         System.out.println("6 Friday.");
         break;
         case 7:
         System.out.println("7 Saturday.");
         break;
         default:
        System.out.println("Invalid days.");
        break;        
       }
     }
  }
   public class WeekApp{
        public static void main(String arg[])
       {
         Scanner sc=new Scanner (System.in);
          System.out.println("Enter no you want to Display Day");
          int no=sc.nextInt();
          WeekNumber w=new WeekNumber();
           w.setNo(no);
           w.DisplayDay();
       }
   }
    
  