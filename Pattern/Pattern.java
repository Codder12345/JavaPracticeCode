import java.util.*;
  class Pattern{
      
  public static void main(String arg[])
  {
       
        for(int i=0;i<5;i++)
       {
          char ch=65;
       for(int j=0;j<9;j++)
     {
       if(j<i)
       {
       System.out.printf("%c",ch++);
       }
     }
     ch=65;
     
     System.out.println();
    }
  }
  }