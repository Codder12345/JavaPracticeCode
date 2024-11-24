import java.util.*;
class AllAscii{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch=0;
while(ch<=255)
{
System.out.printf(" %c ->%d",ch,ch);
ch++;
}
}
}