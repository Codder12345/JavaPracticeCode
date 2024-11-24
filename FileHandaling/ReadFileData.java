//Read Data
import java .util.*;
import java .io.*;
 public class ReadFileData
{
 public static void main(String arg[])throws Exception
 {
   FileReader fr=new FileReader("E:\\GiriTCH\\pooja GTH febbatch\\java\\FileHandaling\\demo.txt");
   int data;
   while((data=fr.read())!=-1)
   {
       System.out.print((char)data);
       Thread.sleep(100);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 }
} 
