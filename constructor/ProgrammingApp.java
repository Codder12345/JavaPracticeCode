import java.util.*;
 class Programming{
          String str1="I Love ";
          String str2; 
       Programming(String str2)
       {
        this.str2=str2;
       }
       void show()
       {
        String s3=str1+str2;
        
        System.out.println(" ' "+s3+" ' ");
       }
 }
 public class ProgrammingApp{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter string for users:");
       String str=sc.next();
        Programming p=new Programming(str);
         p.show();
    }
 }