abstract class Number
{   int no;
   void setNum(int no)
   {this.no=no;
   }
   abstract int getNo();
}
class Rev extends Number
{
   int getNo()
   {
       int r=0;
	   while(no!=0)
	   {  int rem = no % 10;
	       no  = no /10;
		   r=r*10+rem;
	   }
	   return r;
   }
}
class SumOfDigit extends Number
{
    int getNo(){
	  int s=0;
	  while(no!=0)
	  {  int rem=no%10;
	     no = no /10;
		  s=s+rem;
	  }
	  return s;
	}
}
class NumberOperation
{
    void setNumberOperation(Number n)
	{  int result=n.getNo();
	  System.out.println("Result is "+result);
	}
}
public class NumberOperationApp
{    public static void main(String x[])
	{       Number numRef=null;
		NumberOperation nopt = new NumberOperation();
		numRef=new Rev();
		numRef.setNum(123);
		nopt.setNumberOperation(numRef);
		numRef=new SumOfDigit();
		numRef.setNum(5678);
		nopt.setNumberOperation(numRef);
		
	}
}


