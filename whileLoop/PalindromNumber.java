import java.util.*;
class PalindromNumber{
 public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter number");
int no=sc.nextInt();
int rem=0,rev=0;
int temp=no;
while(no!=0)
{
rem=no%10;
rev=rev*10+rem;
no=no/10;
}
System.out.print(rev);
if(rev==temp)
{
System.out.print("number is palindrom");
}
else{
System.out.printf("not palindrom");
}
}
}