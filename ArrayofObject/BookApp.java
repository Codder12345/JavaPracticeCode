/*
Q1. WAP to create POJO class name as Book with field id,name and price and create 5 objects of book class using array of objects and arrange all books in descending order by using its price.
*/
  import java.util.*;
    class Book{
       private int id;
       private String name;
       private int price;
       
        public void setID(int id)
        {
         this.id=id;
        }
        public int getID()
        {
         return id;
        }
        public void setName(String name)
        {
         this.name=name;
        }
        public String getName()
        {
        return name;
        }
       public void setPrice(int price)
       {
        this.price=price;
       }
       public int getPrice()
       {
        return price;
       }
       
    }
    public class BookApp{
      public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of we want to create object how many objects");
          int size=sc.nextInt();
          
          Book b[]=new Book[size];
           
           for(int i=0;i<b.length;i++)
           {
              b[i]=new Book();
               System.out.println("Enter id name and price of the book:");
               b[i].setID(sc.nextInt());
               b[i].setName(sc.next());
             
               b[i].setPrice(sc.nextInt());
                              
           }
       
           System.out.println("Display Decending order:");
           for(int i=0;i<b.length;i++)
           {
            for(int j=i+1;j<b.length;j++)
            {
               if(b[i].getPrice()<b[j].getPrice())
               {
                  Book temp=b[i];
                  b[i]=b[j];
                  b[j]=temp;
               }
            }
           }
              for(int i=0;i<b.length;i++)
           {
              System.out.println(b[i].getID()+"\t"+b[i].getName()+"\t"+b[i].getPrice());

           } 
          
      }
    }