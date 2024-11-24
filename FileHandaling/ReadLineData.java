import java.util.*;
 import java.io.*;
 
 public class ReadLineData
 {
  public static void main(String arg[])throws Exception
  {
   FileReader fr= new FileReader("E:\\GiriTCH\\pooja GTH febbatch\\java\\FileHandaling\\demo.txt");
   BufferedReader br= new BufferedReader(fr);
   String data;
   while((data=br.readLine())!=null)
   {
    System.out.println(data);
    Thread.sleep
    (1000);
   }
   System.out.println(data);
  }
 }
 