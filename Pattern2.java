import java.util.*;
public class Pattern2{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
 ch=sc.next().charAt(0);
String str=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"vowel":"consonant";
System.out.println(str);
}
}