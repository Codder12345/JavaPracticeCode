/*
: WAP to create class name as Product with field id,name and price with setter and getter methods and we have one more class name as Shop with two methods 
void addNewProduct(Product prod)
void showProduct()

*/
import java.util.*;

   class Product{
   private int id;
   private  String name;
   private int price ;
   
   public void setId(int id)
   {
     this.id=id;
   }
   
   public int getId()
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
   public  void setPrice(int price)
   {
       this.price=price;
   }
   public int  getPrice()
   {
     return price;
   }
   
   }
   
   class Shop{
     private Product p;
     
     public void addNewProduct(Product pro){
          p=pro;
     }
     
     public void showProduct()
     {
     System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice());
     }
        
   }
   
    class ProductApp{
         public static void main(String arg[])
    {
       Shop s=new Shop();
      Product p1=new Product();
      p1.setId(1);
      p1.setName("TV");
      p1.setPrice(100);
      s.addNewProduct(p1);
      s.showProduct();
    }
   }
