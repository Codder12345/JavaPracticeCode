 import java.util.*;
 import java.io.*;
 public class CreateFile
  {
   File f=new File("E:\\GiriTCH\\pooja GTH febbatch\\demo.txt",true);
   boolean b=f.createFile();
   if(b)
   {
      System.out.println("yes");  
   }       
   else
   {
       System.out.println("No");
   }
     
    
 }