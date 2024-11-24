import java.util.*;
 import java.io.*;
  
  public class NewCreateFile
  {
   public static void main(String arg[])throws Exception
   
   {
    Scanner sc=new Scanner (System.in);
    File f=new File("E:\\GiriTCH\\pooja GTH febbatch\\java\\Exception\\demo.txt");
    boolean b=f.createNewFile();
     if(b)
    {
     System.out.println("file created");
    }
    else
    {
    System.out.println("allready exit");
    }
   }
   
  }