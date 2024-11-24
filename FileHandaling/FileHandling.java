import java.util.*;
 import java.io.*;
 //Write Data in file 
   class FileHandling
   {
       public static void main(String arg[])throws Exception
       {
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("E:\\GiriTCH\\pooja GTH febbatch\\java\\FileHandaling\\demo.txt",true);
        System.out.println("Enter Data for write file");
        String data=sc.nextLine();
        fw.write(data);
        System.out.println("Data save Sucess......");
        fw.close();
      }
   }
