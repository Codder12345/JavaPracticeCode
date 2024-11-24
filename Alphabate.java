import java.util.*;
public class Alphabate{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
String s=(ch>='A'&&ch<='Z')?"character is Uppercase":(ch>='a' &&ch<='z')?"character is lower":"consonant or special symbol";
System.out.println(s);
}
}