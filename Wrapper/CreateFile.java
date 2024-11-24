 import java.util.*;
 import java.io.*;
 public class CreateFile
  {
   FileWriter f=new FileWriter("E:\\GiriTCH\\pooja GTH febbatch\\demo.txt",true);
   boolean b=f.mkdir();
   if(b)
   {
      System.out.println("yes");  
   }       
   else
   {
       System.out.println("No");
   }
     
    
 }