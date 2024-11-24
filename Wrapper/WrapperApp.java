 public class WrapperApp{
 public static void main(String ...arg)
 {
    int a=10;
    long b;
    b=a;// implicit coversion
   System.out.printf("B =%d\n",b);
    long d=100;
    
    int E=(int)d;//explicit conversion
    System.out.printf("E =%d\n",E);
    
    String s="1234";
    int a=(int)s;
    System.out.println(a);
    
    }
}