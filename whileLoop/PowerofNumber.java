import java.util.*;
class PowerofNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter base and index");
int base=sc.nextInt();
int index=sc.nextInt();
int p=1;
for(int i=0;i<index;i++)
{
p=p*base;
}
System.out.printf("power of Number is %d=%d",base,p);
}
}