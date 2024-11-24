import java.util.*;
class PowerofNumbr{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int base=sc.nextInt();
int index=sc.nextInt();
int p=1;
for(i=0;i<index;i++)
{
p=p*base;
}
System.out.printf("power of Number is %d=%d",base,p);
}
}