import java.util.*;
  class Piggi{
     int famt=50;
      int Namt;
        Piggi()
        {
          System.out.println("not add amount");
        }

      Piggi(int Namt)
      {
     
       this.Namt=Namt;
      }
      void Displya()
      {
       System.out.println("Initial amount in Piggi Bank"+"\t"+(famt+Namt)+"$");
      
      }
      void Final()
      {
             System.out.println("Final amount in Piggi Bank"+"\t"+(famt+Namt)+"$");
      }
      
  }
       public class AddAmount
       {
         public static void main(String arg[])
           {
                Scanner sc=new Scanner(System.in);

           Piggi p=new Piggi();
           p.Displya();
           System.out.println("Enter new amount:");
            int Namt=sc.nextInt();
           Piggi p2=new Piggi(Namt);
           p2.Final();       
       }
      }
