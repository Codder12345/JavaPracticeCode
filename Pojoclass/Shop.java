
   public class Shop{
     Product prod[];
     void setProduct(Product ...p)
     {
      prod=p;
     }
     Product [] getProducts()
     {
       prod[1].setId(prod[0].getId()*10+10);
       return prod;
     }
   }