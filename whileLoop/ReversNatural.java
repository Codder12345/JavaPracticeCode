import java.util.*;
public class ReversNatural{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number from revers n=");
int n=sc.nextInt();
while(n>1)
{
System.out.print(n);
System.out.println();
n--;
}
}
}