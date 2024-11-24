  import java.util.*;
 
 class  ClassNotFoundException {
     public static void main(String arg[])
       {
        System.out.println("Start-------");
        
              Class.forName("abc");
          try{
               Scanner sc=new Scanner("System.in");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=a/b;
              System.out.println(c);
          }
          catch(Exception ex)
          {
              System.out.println("Error"+ex);
          }
          System.out.println("End--------");
         
    
     
     
  }
}