import java.io.*;
 import java.util.*;
  public class WriterReadApp{
   public static void main(String arg[])throws Exception
   {
    FileWriter fb=new FileWriter("E:\\GiriTCH\\pooja GTH febbatch\\java\\FileHandaling\\demo.txt",true);
    BufferedWriter bw= new BufferedWriter(fb);
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Data in file");
    String data=xyz.nextLine();
    bw.write(data);
    bw.newLine();
    bw.close();
    System.out.println("Data Save Success.......");
    fb.close();
  }
  }