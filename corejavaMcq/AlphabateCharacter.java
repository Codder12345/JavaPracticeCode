import java.util.*;
 class AlphabateCharacter{
  public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
        if(ch>=65 && ch<=90||ch>=97 && ch<=122)
        {
            System.out.println("Character is Alphabate");
        }            
        else if(ch>=48 &&ch<=56)
        {
            System.out.println("Character is Digit");
        }
        else{
             System.out.println("Character is Special symbol.");
        }
      
       
  }
 }