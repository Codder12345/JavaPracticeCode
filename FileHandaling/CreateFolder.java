//Create Folder

import java.util.*;
import java.io.*;
 class CreateFolder
{
 public static void main(String arg[])throws Exception
 {
 Scanner sc=new Scanner (System.in);
  File f=new File("E:\\GiriTCH\\pooja GTH febbatch\\java\\abc");
  boolean b=f.mkdir();
  if(b)
  {
       System.out.println("File is created....");
  }
  else
  {
      System.out.println("Allready Exit...");
  }
 
  
 }
} 

