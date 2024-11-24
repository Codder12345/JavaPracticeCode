
  class ShopApplication{
     public static void main(String arg[])
     {
      Shop s1=new Shop();
      Product p1=new Product();
      p1.setId(1);
      p1.setName("Abc");
      p1.setPrice(1000);
      
      Product p2=new Product();
      p2.setId(2);
      p2.setName("Mno");
      p2.setPrice(20000);
      
      Product p3=new Product();
      p3.setId(3);
      p3.setName("opq");
      p3.setPrice(3000);
      
      s1.setProduct(p1,p2,p3);
      
      Product prods[]=s1.getProduct();
      for(int i=0;i<prods.length;i++)
      {
       System.out.println(prods[i].getId()+"\t"+prods[i].getName()+"\t"+prods[i].getPrice());
      }
      
     }
   }