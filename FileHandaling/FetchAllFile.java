import java.io.*;
import java.util.*;
 public class FetchAllFile
 {
  public static void main(String arg[])
  {
    File f=new File("E:\\GiriTCH\\pooja GTH febbatch\\java");
    File list[]=f.listFiles();
    for(int i=0;i<list.length;i++)
    {
        if(list[i].isDirectory())
        {
             System.out.println(list[i]);
        }
    }
    
  }
 }
 