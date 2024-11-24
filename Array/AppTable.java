import java.util.*;

 class Table{
   private int x;
   
   void setNo(int No)
   {
    x=No;
   }
  void showTable()
  {
  for( int i=1;i<=10;i++)
  {
  System.out.printf("%d \n",x*i);
  }
  }
  }
  public class AppTable{
  public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
    
    Table t=new Table();
   t.setNo(x);
   t.showTable();
   }
  
  }