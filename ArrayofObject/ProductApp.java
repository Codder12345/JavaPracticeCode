/*
Q3. WAP to Create class name as Product as POJO with field id,name and price create array of object of product of size 10 and find the product whose price is same.
*/
  import java.util.*;
    class Product{
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
    public class ProductApp{
      public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of we want to create object how many objects");
          int size=sc.nextInt();
          
          Product b[]=new Product[size];
           
           for(int i=0;i<b.length;i++)
           {
              b[i]=new Product();
               System.out.println("Enter id name and  price of product:");
               b[i].setID(sc.nextInt());
               b[i].setName(sc.next());
             
               b[i].setPrice(sc.nextInt());
                              
           }
       
           System.out.println("Display Same price product:");
           for(int i=0;i<b.length-1;i++)
           {
            
                 for(int j=i+1;j<b.length;j++)
                 {
                        if(b[i].getPrice()==b[j].getPrice())
                     {
                       System.out.println(b[i].getID()+"\t"+b[i].getName()+"\t"+b[i].getPrice()); 
                       System.out.println(b[j].getID()+"\t"+b[j].getName()+"\t"+b[j].getPrice());   
                   
                    }
                 }
                  

           }
              
      }
    }