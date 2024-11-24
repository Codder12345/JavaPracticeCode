import java.util.*;
 class Pattern1{
   public static void main(String arg[])
   {
       
      for(int i=0;i<5;i++)
       {
           char ch=97,c=65;
        {
          for(int j=0;j<5;j++)
           {
            if(j<=i)
              {
               
                 if(i%2==0)
                  {
                    System.out.printf("%c",ch++);  
                         
                   }
                   else{
                    System.out.printf("%c",c++);  
                          
                    }
                 }
            }
             
          System.out.println();
         }
       }
   }
 }