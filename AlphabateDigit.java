import java.util.*;
public class AlphabateDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
String s=(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')?"character is Alphabate" :(ch>='0'&&ch<='9')?"character Digit":" character is consonant";
System.out.println(s);
}
}