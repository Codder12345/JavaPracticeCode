import java.util.*;
public class Number{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
char ch[]=new char[10];
char b[]=new char[10];
char d[]=new char[10];
char e[]=new char[10];
char g[]=new char[10];
char f[]=new char[10];
int i;
System.out.printf("Enter character array");
for(i=0;i<10;i++)
{
ch[i]=sc.next().charAt(0);
}

int c;
do{
System.out.printf("1:######7890 \n");
System.out.printf("2:1234###### \n");
System.out.printf("3:123####890 \n");
System.out.printf("4:###4567### \n");
System.out.printf("5:1#3#5#7#9# \n");
System.out.printf("6:#2#4#6#8#0 \n");
System.out.printf("0:Exit\n");
System.out.printf("Enter your choice:\n");
c=sc.nextInt();
switch(c)
{
case 1:
for(i=0;i<10;i++)
{
if(i>=0 && i<=5)
{
ch[i]='#';
System.out.printf("%c",ch[i]);
}
else{
System.out.printf("%c",ch[i]);
}
}
System.out.println();
break;

case 2:
System.out.printf("Enter array element");
for(i=0;i<10;i++)
{
b[i]=sc.next().charAt(0);
}
System.out.println();
for(i=0;i<10;i++)
{
if(i>=0 && i<4)
{
System.out.printf("%c",b[i]);
}
else{
b[i]='#';
System.out.printf("%c",b[i]);
}
}
System.out.println();
break;

case 3:
System.out.printf("Enter array element");
for(i=0;i<10;i++)
{
f[i]=sc.next().charAt(0);
}
System.out.println();
for(i=0;i<10;i++)
{
if(i>=0 && i<4 ||i>6)
{
System.out.printf("%c",f[i]);
}
else{
f[i]='#';
System.out.printf("%c",f[i]);
}
}
System.out.println();
break;

case 4:
System.out.printf("Enter array element");
for(i=0;i<10;i++)
{
d[i]=sc.next().charAt(0);
}
System.out.println();
for(i=0;i<10;i++)
{
if(i>=0 && i<3 ||i>6)
{
d[i]='#';
System.out.printf("%c",d[i]);
}
else{
System.out.printf("%c",d[i]);
}
}
System.out.println();
break;

case 5:
System.out.printf("Enter array element");
for(i=0;i<10;i++)
{
e[i]=sc.next().charAt(0);
}
System.out.println();
for(i=0;i<10;i++)
{
if(i%2==0)
{
System.out.printf("%c",e[i]);
}
else{
e[i]='#';
System.out.printf("%c",e[i]);
}
}
System.out.println();
break;
case 6:
System.out.printf("Enter array element");
for(i=0;i<10;i++)
{
g[i]=sc.next().charAt(0);
}
System.out.println();
for(i=0;i<10;i++)
{
if(i%2==0)
{
g[i]='#';
System.out.printf("%c",g[i]);
}
else{
System.out.printf("%c",g[i]);
}
}
System.out.println();
break;
}
}while(c!=0);

}
}